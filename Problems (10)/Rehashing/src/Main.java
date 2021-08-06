import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HashTable<String> hashTable = new HashTable<>(5);
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            String value = scanner.nextLine().trim();
            hashTable.put(key, value);
        }
        System.out.println(hashTable);
    }

    private static class TableEntry<T> {
        private final int key;
        private final T value;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            int index = findKey(key);
            if (index == -1) {
                rehash();
            }
            index = findKey(key);
            if (index == -1) {
                return false;
            }
            table[index] = new TableEntry(key, value);
            return true;
        }

        public T get(int key) {
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
          