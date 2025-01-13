package beginner;

/*
Capitalize Strings
Convert a list of strings to uppercase.

Input: ["apple", "banana", "cherry"]
Output: ["APPLE", "BANANA", "CHERRY"]
*/

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry");
        List<String> uppercaseStrings= strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaseStrings);
    }
}
