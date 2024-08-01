package reducing_summarizing;

import stream.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultilevelGrouping {
    public static void main(String[] args) {
        List<Dish> menu = DishFactory.getMenu();

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel =
                menu.stream().collect(
                        Collectors.groupingBy(Dish::getType,
                                Collectors.groupingBy(dish -> {
                                    int calory = dish.getCalories();
                                    if (calory <= 400)
                                        return CaloricLevel.DIET;
                                    else if (calory <= 700)
                                        return CaloricLevel.NORMAL;
                                    else
                                        return CaloricLevel.FAT;
                                }))
                );

        dishesByTypeCaloricLevel.keySet().forEach(val -> System.out.println(val + " : " + dishesByTypeCaloricLevel.get(val)));
    }
}
