package reducing_summarizing;

import stream.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxBy {
    public static void main(String[] args) {
        List<Dish> menu = DishFactory.getMenu();

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCaloriesDish = menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));
        System.out.println(mostCaloriesDish);
    }
}
