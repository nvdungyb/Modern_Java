package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> result = list.stream()
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
