package passing_code;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Có thể tryền một phương thức vào làm tham số (parameter).
        List<Apple> result = FilterApple.filterApples(inventory.getListApples(), FilterApple::isGreenApple);
        System.out.println(result);
    }
}
