package passing_code;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {

    public static boolean isGreenApple(Apple apple) {
        return apple.getColor().equals(AppleColor.GREEN.name());
    }

    public static boolean isRedApple(Apple apple) {
        return apple.getColor().equals(AppleColor.RED.name());
    }

    // Một phương thức được truyền vào dưới dạng tham số Predicate.
    public static List<Apple> filterApples(List<Apple> listApples, Predecate<Apple> p) {
        List<Apple> filterdApples = new ArrayList<>();

        for (Apple apple : listApples) {
            if (p.test(apple)) {                // kiểm tra xem có thỏa điều kiện?
                filterdApples.add(apple);
            }
        }

        return filterdApples;
    }
}
