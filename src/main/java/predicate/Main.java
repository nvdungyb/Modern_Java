package predicate;

import passing_code.Apple;
import passing_code.AppleColor;
import passing_code.Inventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static List<Apple> getListApples(Predicate predicate) {
        Inventory inventory = new Inventory();

        List<Apple> listApples = inventory.getListApples();
        List<Apple> res = new ArrayList<>();
        for (Apple apple : listApples) {
            if (predicate.test(apple))
                res.add(apple);
        }
        return res;
    }

    // Composing Predicates: read more at java.util.function.Predicate;
    public static void main(String[] args) {
        Predicate<Apple> redApple = (Apple apple) -> apple.getColor().equals(AppleColor.RED.name());
        Predicate<Apple> redAndHeavyApple = redApple.and((Apple apple) -> apple.getWeight() > 150);
        Predicate<Apple> redAndHeavyOrGreenApple = redAndHeavyApple.or((Apple apple) -> apple.getColor().equals(AppleColor.GREEN.name()));

        List<Apple> result = getListApples(redAndHeavyOrGreenApple);
        result.sort(Comparator.comparing(Apple::getColor).thenComparing(Apple::getWeight));
        System.out.println(result);
    }
}
