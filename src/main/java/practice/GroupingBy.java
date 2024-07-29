package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GroupingBy {
    public static void main(String[] args) {

        // Given list of integers, return true if any value appear at least twice in the array, else return false;
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        boolean res = myList.stream()
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(entry -> entry.getValue() > 1);

        System.out.println(res);

        // Find only duplicate elements with it count from the String ArrayList in java 8.
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> result = names.stream()
                .collect(groupingBy(e -> e, HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }
}
