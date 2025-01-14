package intermediate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Count the frequency of each word in a list of strings.
Input: ["apple", "banana", "apple", "cherry", "banana", "banana"]
Output: {"apple": 2, "banana": 3, "cherry": 1}
 */
public class WordFrequencyCount {
    public static void main(String[] args) {
       List<String> words = List.of("apple", "banana", "apple", "cherry", "banana", "banana");

//       1st WAY
       Map<String, Long> frequencyCountByGrouping = words.stream().collect(Collectors.groupingBy(
                word -> word,
                LinkedHashMap::new, //to maintain the input order,  ignore if not needed
                Collectors.counting()
        ));

        System.out.println("Grouping - "+ frequencyCountByGrouping);

    }
}
