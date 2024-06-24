package constructor_references;

import passing_code.Apple;
import passing_code.AppleColor;

import java.util.function.BiFunction;

public class main {
    public static void main(String[] args) {
        BiFunction<Integer, AppleColor, Apple> func = Apple::new;
        Apple res = func.apply(100, AppleColor.RED);
        System.out.println(res);
    }
}
