package beginner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/*
Filter Even Numbers
Given a list of integers, filter out only the even numbers and return them as a list.
Filter Even Numbers

Input: [1, 2, 3, 4, 5, 6]
Output: [2, 4, 6]
*/

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Set<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
        evenNumbers.forEach(System.out::println);
    }
}
