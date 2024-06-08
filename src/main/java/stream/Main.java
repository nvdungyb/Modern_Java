package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2021US002");
        list.add("2021US003");
        list.add("2021US001");
        list.add("2022VN001");
        list.add("2022VN002");
        list.add("2022VN003");

        Stream stream = list.stream().filter((element) -> element.startsWith("2021")).sorted(Comparator.comparing(o -> o.substring(6)));
        stream.forEach(System.out::println);
    }
}
