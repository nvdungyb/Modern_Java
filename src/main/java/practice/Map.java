package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        // Given a list of integers, find out all the numbers starting with 1 using Stream functions.
        myList.stream()
                .map(x -> x + "")
                .filter(x -> x.startsWith("1"))
                .forEach(System.out::println);

        // How to find duplicate elements in a given integers list using Stream function.
        Set<Integer> st = new HashSet<>();
        myList.stream()
                .filter(x -> !st.add(x))
                .forEach(System.out::println);

        // Find the first elements of the list using Stream functions.
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        // Find the total number of elements present in the list using Stream functions.
        long count = myList.stream().count();
        System.out.println(count);

        // Find the total value of elements in the list.
        int total = myList.stream().mapToInt(Integer::intValue).sum();
        int sum = myList.stream().reduce(0, Integer::sum);
        int value = myList.stream().reduce(0, (x, y) -> x + y);
        System.out.println(total + " " + sum + " " + value);

        // Find the maximum value element present in it using Stream function.
        int max = myList.stream().max(Integer::compare).get();
        System.out.println(max);


    }
}
