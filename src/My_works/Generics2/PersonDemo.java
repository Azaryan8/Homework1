package My_works.Generics2;

public class PersonDemo {
    public static void main(String[] args) {
        PersonList personList = new PersonList();

        personList.addPerson(new Person("Maria",20));
        personList.addPerson(new Person("Viktoria",19));
        personList.addPerson(new Person("Olivia",24));
        personList.addPerson(new Person("Ilya",21));
        personList.addPerson(new Person("Max",17));
        personList.addPerson(new Person("Bek",27));

        System.out.println("Printing even-indexed people:");
        personList.printData(true);

        System.out.println("------------------");
        personList.printData(false);

    }
}
