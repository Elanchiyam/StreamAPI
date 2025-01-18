package advanced.uniqueCities;

import java.util.List;
import java.util.stream.Collectors;

/*
From a list of Person objects, extract a distinct list of cities where they live.

Input: [{name: "Alice", city: "New York"}, {name: "Bob", city: "Los Angeles"},
{name: "Charlie", city: "New York"}]
Output: ["New York", "Los Angeles"]
 */
public class UniqueCities {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice","New York"),
                new Person("Bob","Los Angeles"),
                new Person("Charlie","New York")
        );

        List<String> distinctCities = persons.stream()
                .map(person -> person.getCity())
                .distinct()
                .toList();
        System.out.println(distinctCities);
    }
}
