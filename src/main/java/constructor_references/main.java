package constructor_references;

import passing_code.Apple;
import passing_code.AppleColor;

import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        // Các Functional interface nhận tham số T và trả về kiểu T gồm : Supplier<T>
        // Constructor reference to the default Apple Constructor.
        Supplier<Apple> supplier1 = Apple::new;
        Apple getApple1 = supplier1.get();

        // Lambda expression to create an Apple using the default constructor.
        Supplier<Apple> supplier2 = () -> new Apple(12, AppleColor.RED);
        Apple getApple2 = supplier2.get();

        System.out.println(getApple1);
        System.out.println(getApple2);
    }
}
