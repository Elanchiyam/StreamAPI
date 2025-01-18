package advanced.customCollector;

import java.util.List;
import java.util.stream.Collectors;

/*
Implement a custom collector to concatenate strings in a list with a prefix and suffix.
Input: ["apple", "banana", "cherry"] (Prefix: [, Suffix: ], Separator: , )
Output: "[apple, banana, cherry]"
 */
public class CustomCollector {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry");
         String output = stringList.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println("output : "+ output);
    }
}
