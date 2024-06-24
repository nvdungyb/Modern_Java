package function;

import java.util.function.Function;

public class ComposingFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> plus = x -> x + 1;
        Function<Integer, Integer> mul = x -> x * 2;
        Function<Integer, Integer> act = plus.andThen(mul);

        Integer result = act.apply(10);
        System.out.println(result);
    }
}
