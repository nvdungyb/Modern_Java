package reducing_summarizing;

import stream.Dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxBy {
    public static void main(String[] args) {
        Dish d1 = new Dish("pork", false, 800, Dish.Type.MEAT);
        Dish d2 = new Dish("beef", false, 700, Dish.Type.MEAT);
        Dish d3 = new Dish("chicken", false, 400, Dish.Type.MEAT);
        Dish d4 = new Dish("french fries", true, 530, Dish.Type.OTHER);
        Dish d5 = new Dish("rice", true, 350, Dish.Type.OTHER);
        Dish d6 = new Dish("season fruit", true, 120, Dish.Type.OTHER);
        Dish d7 = new Dish("pizza", true, 550, Dish.Type.OTHER);
        Dish d8 = new Dish("prawns", false, 300, Dish.Type.FISH);
        Dish d9 = new Dish("salmon", false, 450, Dish.Type.FISH);

        List<Dish> menu = new ArrayList<>();
        menu.addAll(List.of(d1, d2, d3, d4, d5, d6, d7, d8, d9));

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCaloriesDish = menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));
        System.out.println(mostCaloriesDish);
    }
}
