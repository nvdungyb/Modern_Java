package constructor_references;

import passing_code.Apple;
import passing_code.AppleColor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

public class main {

    public static Map<String, BiFunction<Integer, AppleColor, Apple>> map = new HashMap<>();

    public static void init() {
        map.put("apple", Apple::new);
//        map.put("orange", Orange::new);
    }

    public static Apple giveFruit(String fruit, Integer weight, AppleColor appleColor) {
        return map.get(fruit.toLowerCase()).apply(weight, appleColor);
    }

    public static void main(String[] args) {
        init();
        Apple res = giveFruit("Apple", 200, AppleColor.GREEN);
        System.out.println(res);
    }
}
