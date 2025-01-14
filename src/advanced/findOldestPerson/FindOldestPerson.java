package advanced.findOldestPerson;

/*
Given a list of Person objects (name, age, city), find the oldest person.

Input: [{name: "Alice", age: 30}, {name: "Bob", age: 40}, {name: "Charlie", age: 35}]
Output: {name: "Bob", age: 40}
 */

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindOldestPerson {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Alice", 30, "Chennai"),
                new Person("Bob", 40, "Delhi"),
                new Person("Charlie", 35, "Mumbai")
        );

//        1st Way - using max
        Optional<Person> oldestPerson = personList
                .stream()
                .max(Comparator.comparingInt(Person::getAge));
        System.out.println("Oldest Person : " + oldestPerson.get());

//        2nd Way - using reduce
        Optional<Person> oldestPersonUsingReduce = personList
                .stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);

        System.out.println("Oldest Person using reduce: " + oldestPersonUsingReduce.get());

    }
}
