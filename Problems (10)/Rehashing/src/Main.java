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

        public Tab