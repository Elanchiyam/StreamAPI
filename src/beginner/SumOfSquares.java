package beginner;

/*

Sum of Squares

Calculate the sum of squares of a list of integers.
Input: [1, 2, 3, 4]
Output: 30 (1² + 2² + 3² + 4²)
*/

import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);


        // 1. Using reduce
        Integer sumOfsquaresusingReducequaresusingReduce = numbers.stream().map(n->n*n).reduce(0,(a, b)->a+b);

        //2. using maptoInt and sum method
        numbers.stream().mapToInt(n->n*n).sum();
        System.out.println(sumOfsquaresusingReducequaresusingReduce);
    }
}
