package My_works.Generics2;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> people;

    public PersonList() {
        this.people = new ArrayList<>();
    }
    public void addPerson(Person person){
        this.people.add(person);
    }

    public void printData(boolean printList){
        for (int i = 0; i < people.size(); i++) {
            if (printList) {
                if (i % 2 == 0) {
                    System.out.println(people.get(i));
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(people.get(i));
                }
            }
        }

    }}