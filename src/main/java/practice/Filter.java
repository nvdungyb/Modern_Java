package practice;

import java.util.Arrays;
import java.util.List;

public class Filter {

    // given a list of integers, find out all the even numbers that exits in the list using Stream function.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
