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
    }
}