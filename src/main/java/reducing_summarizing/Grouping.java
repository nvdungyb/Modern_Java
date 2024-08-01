package reducing_summarizing;

import stream.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Dish> menu = DishFactory.getMenu();

        Map<Dish.Type, List<Dish>> dishByType = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType));

        dishByType.keySet().stream().forEach(val -> System.out.println(val + " : " + dishByType.get(val)));

        // We can classify more complex than a simple property accessor.
        Map<CaloricLevel, List<Dish>> dishByCaloricLevel = menu.stream()
                .collect(Collectors.groupingBy(dish -> {
                    if (dish.getCalories() < 400)
                        return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700)
                        return CaloricLevel.NORMAL;
                    else
                        return CaloricLevel.FAT;
                }));

        dishByCaloricLevel.keySet().forEach(val -> System.out.println(val + " : " + dishByCaloricLevel.get(val)));

        // We can manipulate grouped elements.
        Map<Dish.Type, List<Dish>> caloricByType = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.filtering(val -> val.getCalories() > 500, Collectors.toList())));

        caloricByType.keySet().forEach(val -> System.out.println(val + " : " + caloricByType.get(val)));

        // We can use mapping to extract the name of dishes by type.
        Map<Dish.Type, List<String>> disNamesByType = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(Dish::getName, Collectors.toList())));

        disNamesByType.keySet().forEach(val -> System.out.println(val + " : " + disNamesByType.get(val)));
    }
}