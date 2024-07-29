package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile {
    /**
     * If you have a special source that every element in order.
     * and you want to get all elements smaller than k for example.
     * Instead of using filter which iterates all elements in the stream basically
     * We can use takeWhile operation, it could stop once when we found predicate return true.
     * With large stream of elements, we can see it so usefully.
     * <p>
     * We have dropWhile operation, it is the complement of takeWhile.
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7, 9, 10, 11, 22, 24, 56, 87};
        List<Integer> ls = Arrays.stream(arr).toList();

        List<Integer> res = ls.stream()
                .takeWhile(val -> val < 22)
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
