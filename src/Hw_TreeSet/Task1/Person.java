package Hw_TreeSet.Task1;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>, Comparator<Person> {
    private String Name;
    private String Surname;

    public Person(String name, String surname) {
        this.Name = name;
        this.Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        return getName().compareTo(other.Name);
    }

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getSurname(), person.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}
