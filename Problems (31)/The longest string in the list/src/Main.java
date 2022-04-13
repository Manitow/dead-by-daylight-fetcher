import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void changeList(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        String longestString = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            String string = list.get(i);
            if (string.length() > longestString.length()) {
                longestString = string;
            }
        }
        for (int i = 0; i < size; i++) {
            list.set(i, longestString);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = 