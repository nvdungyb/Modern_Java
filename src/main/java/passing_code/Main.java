package passing_code;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        List<Apple> listApples = inventory.getListApples();
        listApples.sort(Comparator.comparingInt(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(listApples);
    }
}
