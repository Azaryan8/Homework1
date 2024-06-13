package My_works.Person;

import My_works.Person.Person;

public class PersonInfo {
    public static void main(String[] args) {
        Person person1 = new Person("Иван",25);
        Person person2 = new Person("Адель",21);


        System.out.println(person1);
        System.out.println(person2);

        person1.talk();
        person2.move();









    }
}
