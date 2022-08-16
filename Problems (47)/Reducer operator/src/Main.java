/**
 * The operator combines all values in the given range into one value
 * using combiner and initial value (seed)
 */
public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator =
        (initValue, combiner) -> (left, right) -> {
            int value = initValue;
            for (int i = left; i <= right; i++) {
                va