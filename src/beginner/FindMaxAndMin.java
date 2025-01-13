package beginner;

/*

Find Maximum and Minimum
Find the maximum and minimum numbers in a list of integers using max() and min().

Input: [10, 5, 8, 20, 15]
Output: Maximum: 20, Minimum: 5
*/


import java.util.List;
import java.util.Optional;

public class FindMaxAndMin {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 20, 15);
        //1. using max
        int max = numbers.stream().max(Integer::compareTo).get();
        int max2 = numbers.stream().max((a,b)->a-b).get();
        System.out.println(max2);

        int min = numbers.stream().min((a,b)->a-b).get();
        System.out.println(min);

    }
}
