package practice;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class FindingAndMatching {
    /**
     * 1 - The anyMatch method can be used to answer the question "Is there an element in the stream matching the given predicate?"
     * The anyMatch method return boolean, so it is the terminal operation.
     * <p>
     * 2 - The allMatch method works similarly to anyMatch but will check to see if all the elements of the stream match the given predicate.
     * <p>
     * 3 - The nonMatch method is the opposite of allMatch method. It ensures that no element in the stream match the given predicate.
     * <p>
     * 4 - The findAny method returns an arbitrary element of the current stream.
     * 5 - The findFirst method returns the first element match the predicate.
     * The difference between findFirst and findAny is parallel Stream. The findAny is less constraining when using parallel streams.
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] arr = {"hi", "my", "name", "is", "creek"};
        System.out.println("There is a word that start with 'i' at least : " + Arrays.stream(arr).anyMatch(val -> val.startsWith("i")));

        System.out.println("All the words start with 'i' : " + Arrays.stream(arr).allMatch(val -> val.startsWith("i")));
        System.out.println("There is no word start with 'b' : " + Arrays.stream(arr).noneMatch(val -> val.startsWith("b")));

        Arrays.stream(arr)
                .filter(val -> val.length() > 4)
                .findAny()
                .ifPresent(val -> System.out.println(val));
    }
}
