package advanced.topNPerformers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of employees (name, score), return the names of the top 2 scorers.
Input: [{name: "Alice", score: 95}, {name: "Bob", score: 85}, {name: "Charlie", score: 90}]
Output: ["Alice", "Charlie"] (Top 2 scorers)
 */
public class TopNPerformers {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Alice", 95),
                new Employee("Bob", 85),
                new Employee("Charlie", 90)
        );

        List<String> topScorers = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getScore).reversed())
                .limit(2)
                .map(e->e.getName())
                .collect(Collectors.toList());

        System.out.println(topScorers);
    }
}
