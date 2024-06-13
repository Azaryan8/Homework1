package Hw_TreeSet.Task1;

import Hw_TreeSet.Task1.Person;

import java.util.Set;
import java.util.TreeSet;

public class PersonColection {
    public static void main(String[] args) {

        Set<Person> person = new TreeSet<>();

        person.add(new Person("John","Black"));
        person.add(new Person("Katya","Kucherenko"));
        person.add(new Person("Ilya","Romanenko"));
        person.add(new Person("Misha","Amosov"));


            System.out.println(person);
    }

}
