package intermediate;

import java.util.List;

/*
Given a list of lists, flatten it into a single list using flatMap().
Input: [[1, 2], [3, 4], [5, 6]]
Output: [1, 2, 3, 4, 5, 6]
 */
public class FlattenNestedLists {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3,4),
                List.of(5,6)
        );

         List<Integer> flattenedMap = list.stream()
                 .flatMap(List::stream)
                 .toList();
        System.out.println(flattenedMap);
    }
}
