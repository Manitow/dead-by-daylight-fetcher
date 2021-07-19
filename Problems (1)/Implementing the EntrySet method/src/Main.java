import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        HashTable<String> table = new HashTable<>(count);
        for (int i = 0; i < count; i++) {
            int key = scanner.nextInt();
            String value = scanner.nextLine();
            table.put(key, value);
        }
        for (TableEntry<String> entry : table.entrySet()) {
            System.out.printf("%d: %s%n", entry.getKey(), entry.getValue());
        }
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

   