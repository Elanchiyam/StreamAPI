package intermediate;

/*
Partition a list of integers into two groups:
one with numbers greater than 10 and the other with numbers less than or equal to 10.
Input: [5, 15, 8, 20, 3]
Output:
{
  "greaterThan10": [15, 20],
  "lessThanOrEqualTo10": [5, 8, 3]
}
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByPredicate {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 15, 8, 20, 3);

        Map<Boolean,List<Integer>> partitionedList = numbers.stream().collect(
                Collectors.partitioningBy(num -> num > 10)
        );

        Map<String,List<Integer>> map = Map.of(
                "Greater than 10 ", partitionedList.get(true),
                "Lesser than 10 ", partitionedList.get(false)
        );

        System.out.println(map);
    }
}
