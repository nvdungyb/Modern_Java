package practice;

import java.util.Arrays;
import java.util.Optional;

public class Reducing {
    /**
     * Reducing is repeatedly combining all the elements in the stream repeatedly to produce a single value.
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Optional<Integer> max = Arrays.stream(arr).reduce(Integer::max);
        System.out.println(max.get());

        // How to count number of elements greater than 5
        long cnt = Arrays.stream(arr)
                .filter(val -> val > 5)
                .count();
        System.out.println(cnt);
    }
}
