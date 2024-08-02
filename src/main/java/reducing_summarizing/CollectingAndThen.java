package reducing_summarizing;

import stream.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class CollectingAndThen {
    public static void main(String[] args) {
        List<Dish> menu = DishFactory.getMenu();

        Map<Dish.Type, Dish> mostCaloricDishByType = menu.stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)
                ));

        System.out.println(mostCaloricDishByType);
    }
}
