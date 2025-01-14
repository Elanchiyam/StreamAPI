package intermediate;

import java.util.Arrays;
import java.util.List;

/*
Sort a list of integers in descending order and return the top 3.
Input: [10, 3, 7, 8, 2, 1]
Output: [10, 8, 7] (Top 3 numbers in descending order)
 */
public class SortAndLimitResults {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 7, 8, 2, 1);
        List<Integer> output = numbers.stream().sorted((a, b) -> b - a).limit(3).toList();
        System.out.println(output);
    }
}
