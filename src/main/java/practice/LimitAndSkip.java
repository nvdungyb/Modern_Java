package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
    /**
     * The limit(n) method, which returns another stream that's no longer than a given size.
     * The skip(x) method, which return a stream that discards the first n elements. If the stream has fewer than n elements, an empty stream is returned.
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7, 9, 10, 11, 22, 24, 56, 87};
        List<Integer> ls = Arrays.stream(arr).toList();

        List<Integer> resLimit = ls.stream()
                .takeWhile(val -> val < 22)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(resLimit);

        List<Integer> resSkip = ls.stream()
                .dropWhile(val -> val < 22)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(resSkip);
    }
}
