package reducing_summarizing;

import stream.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Reducing {
    public static void main(String[] args) {
        List<Dish> menu = DishFactory.getMenu();

        int totalCalories = menu.stream()
                .collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        System.out.println(totalCalories);
    }
}
