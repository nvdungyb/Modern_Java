package reducing_summarizing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        return IntStream.range(2, (int) (Math.sqrt(num) + 1))
                .noneMatch(val -> num % val == 0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 43, 34, 64, 233, 7, 6, 51);

        Map<Boolean, List<Integer>> primeNumbers = numbers.stream()
                .collect(partitioningBy(val -> isPrime(val)));

        System.out.println(primeNumbers);
    }
}
