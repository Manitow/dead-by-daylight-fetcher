import java.util.*;
import java.util.stream.*;

public class Main {

    private static List<LongStream> invertedStreams(List<LongStream> streams) {
       return streams.stream()
                .map(s -> s.isParallel() ? s.sequential() : s.parall