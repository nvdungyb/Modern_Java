package passing_code;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Apple> listApples;

    Inventory() {
        listApples = new ArrayList<>();

        Apple apple1 = new Apple(100, AppleColor.GREEN);
        Apple apple2 = new Apple(200, AppleColor.RED);
        Apple apple3 = new Apple(300, AppleColor.GREEN);
        Apple apple4 = new Apple(400, AppleColor.RED);
        Apple apple5 = new Apple(500, AppleColor.GREEN);
        Apple apple6 = new Apple(600, AppleColor.RED);
        Apple apple7 = new Apple(700, AppleColor.GREEN);

        listApples.addAll(List.of(apple1, apple2, apple3, apple4, apple5, apple6, apple7));
    }

    public List<Apple> getListApples() {
        return listApples;
    }

    public void setListApples(List<Apple> listApples) {
        this.listApples = listApples;
    }
}
