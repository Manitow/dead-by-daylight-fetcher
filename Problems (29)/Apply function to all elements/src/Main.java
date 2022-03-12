import java.util.*;
import java.util.function.*;


public class Main {

    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        for (int i = 0; i < array.length; i++) {
            array[i] = func.apply(array[i]);
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanne