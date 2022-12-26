import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    private static List<String> extractCodes(List<String> codes) {
        return codes.stream()
                .dropWhile(Predicate.not("#0000"::equals))
                .skip(1)
                .takeWhile(Predicate.not("#FFFF"::equals))
                .collect(Collectors.toList());
    }

    /* Please do not modify the code below */
    public static void main(String[] args) {
        S