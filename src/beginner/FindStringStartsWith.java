package beginner;

import java.util.Arrays;
import java.util.List;

/*
* Find Strings Starting with "A"
* From a list of names, find all names starting with the letter 'A'.
*
* Input: ["Alice", "Bob", "Anna", "Charlie"]
* Output: ["Alice", "Anna"]
* */
public class FindStringStartsWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie");

        names.stream().filter(str -> str.startsWith("A")).forEach(System.out::println);
    }
}
