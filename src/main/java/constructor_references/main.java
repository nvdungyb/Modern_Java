package constructor_references;

import passing_code.Apple;
import passing_code.AppleColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class main {

    public static List<Apple> map(List<Integer> weights, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (int i : weights) {
            result.add(f.apply(i));
        }
        return result;
    }

    public static void main(String[] args) {
        // Các Functional interface nhận tham số T và trả về kiểu T gồm : Supplier<T>
        // Constructor reference to the default Apple Constructor.
        Supplier<Apple> supplier1 = Apple::new;
        Apple getApple1 = supplier1.get();

        // if you want to create Apple with an attribute for the apple created by Constructor references
        // You can you Function<T,R> return value type R for you.
        Function<Integer, Apple> func = Apple::new;
        Apple appleFromFunc = func.apply(100);

        // it is equivalent to
        Function<Integer, Apple> func2 = (weight) -> new Apple(weight);
        Apple apple2 = func2.apply(200);

        System.out.println(appleFromFunc);
        System.out.println(apple2);

        // OK we can apply that to another operation
        List<Integer> weights = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Apple> apples = map(weights, Apple::new);
        System.out.println(apples);
    }
}
