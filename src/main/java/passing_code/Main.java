package passing_code;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Có thể tryền một phương thức vào làm tham số (parameter).
        List<Apple> result = FilterApple.filterApples(inventory.getListApples(), (Apple a) -> AppleColor.RED.name().equals(a.getColor()));
        System.out.println(result);
    }
}

/* Tại sao có thể truyền các method reference và lambda expression vào các phương thức mà chấp nhận functional interface như là tham số.
    - Khi ta truyền một method reference hoặc một lambda expression, Java sẽ tự động chuyển đổi nó thành một instance của một functional interface tương ứng.

 */