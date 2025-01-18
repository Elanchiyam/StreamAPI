package advanced.infiniteStreamFibonacciSequence;

import java.util.List;
import java.util.stream.Stream;

/*
Generate the first 20 numbers of the Fibonacci sequence using Stream.iterate().
Input: 20 (first 20 numbers)
Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]
 */
public class FibonacciSequence {
    public static void main(String[] args) {
         List<Integer> fibonacciSequence = Stream.iterate(new int[]{0,1},(fib)-> new int[]{fib[1], fib[0]+fib[1]})
                .limit(20)
                .map(fib -> fib[0])
                .toList();

        System.out.println(fibonacciSequence);
    }
}
