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
                } e