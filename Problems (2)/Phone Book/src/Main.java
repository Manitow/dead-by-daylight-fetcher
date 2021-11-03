import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        HashTable<String> table = new HashTable<>(count);
        for (int i = 0; i < count; i++) {
            String command = scanner.next();
            if ("put".equals(command)) {
                int key = scanner.nextInt();
                String value = scanner.nextLine().trim();
                table.put(key, value);
            } else if ("get".equals(command)) {
                int key = scanner.nextInt();
                String value = table.get(key);
                if (value != null) {
                    System.out.println(value);
                } else {
                    System.out.println(-1);
                }
            } else if ("remove".equals(command)) {
                int key = scanner.nextInt();
                table.remove(key);
            }
        }
    }

    private static class TableEntry<T> {
        private final int key;
        private final T value;
        private boolean removed;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }
