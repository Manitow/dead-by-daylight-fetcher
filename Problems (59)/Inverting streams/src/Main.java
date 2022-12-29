import java.util.*;
import java.util.stream.*;

public class Main {

    private static List<LongStream> invertedStreams(List<LongStream> streams) {
       return streams.stream()
                .map(s -> s.isParallel() ? s.sequential() : s.parallel())
                .collect(Collectors.toList());
    }

    /* Do not modify the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Boolean> parallelFlags = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());

        // :)
        List<LongStream> streams = Stream
               