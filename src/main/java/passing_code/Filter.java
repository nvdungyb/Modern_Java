package passing_code;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static boolean isGreenApple(Apple apple) {
        return apple.getColor().equals(AppleColor.GREEN.name());
    }

    public static boolean isRedApple(Apple apple) {
        return apple.getColor().equals(AppleColor.RED.name());
    }

    // Phương thức được truyền vào đối tượng dạng Predicate.
    public static <T> List<T> filterProduct(List<T> listApples, Predicate<T> p) {
        List<T> filterdApples = new ArrayList<>();

        for (T t : listApples) {
            if (p.test(t)) {                // kiểm tra xem có thỏa điều kiện?
                filterdApples.add(t);
            }
        }

        return filterdApples;
    }
}
