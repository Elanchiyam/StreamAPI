package intermediate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of products with name and category, group the products by category.

Input: [{name: "Apple", category: "Fruit"},
 {name: "Carrot", category: "Vegetable"},
 {name: "Banana", category: "Fruit"}]

Output:{
  "Fruit": ["Apple", "Banana"],
  "Vegetable": ["Carrot"]
}
 */
public class GroupByCategory {
    public static void main(String[] args) {

        Map<String, String> products = new HashMap<>();
        products.put("Apple", "Fruit");
        products.put("Carrot", "Vegetable");
        products.put("Banana", "Fruit");
        System.out.println(products);

        Map<String, List<String>> result = products.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        //groupBy
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));

        System.out.println(result);

    }
}
