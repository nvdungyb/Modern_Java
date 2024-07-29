package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        // List a list of distinct characters in follow words.
        String[] arr = {"hello", "my", "friend"};

        List<String> res = Arrays.stream(arr)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(res);

        // Given two lists of numbers, how would we return all pairs of numbers.
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {5, 6, 7};
        List<Integer> ls1 = Arrays.stream(arr1).collect(Collectors.toList());
        List<Integer> ls2 = Arrays.stream(arr2).collect(Collectors.toList());

        List<int[]> result = ls1.stream()
                .flatMap(i -> ls2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        result.forEach(val -> System.out.println(val[0] + " " + val[1]));
    }
}
