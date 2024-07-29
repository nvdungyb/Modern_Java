package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("My", "name", "Dzung");
        List<String> list2 = Arrays.asList("I", "want", "to", "be", "great", "developer");

        Stream<String> result = Stream.concat(list1.stream(), list2.stream());
        result.forEach(System.out::println);
    }
}
