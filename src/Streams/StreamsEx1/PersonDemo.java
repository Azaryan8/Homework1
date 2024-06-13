package Streams.StreamsEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Korloene", 21));
        people.add(new Person("Monica", 22));
        people.add(new Person("Leon", 18));
        people.add(new Person("Bek", 30));
        people.add(new Person("Adel", 34));
        people.add(new Person("Mariel", 40));

        System.out.println("Our People: " + people);

        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());

        System.out.println("Our new people are: " + filteredPeople);
    }
}




