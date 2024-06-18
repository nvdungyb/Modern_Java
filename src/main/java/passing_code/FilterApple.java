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

    // Phương thức được truyền vào đối tượng dạng Predicate.
    public static List<Apple> filterApples(List<Apple> listApples, Predicate<Apple> p) {
        List<Apple> filterdApples = new ArrayList<>();

        for (Apple apple : listApples) {
            if (p.test(apple)) {                // kiểm tra xem có thỏa điều kiện?
                filterdApples.add(apple);
            }
        }

        return filterdApples;
    }
}
