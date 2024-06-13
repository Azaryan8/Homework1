package My_works.Generics;

public class PersonDemo {
    public static void main(String[] args) {
        Person<String,Integer> person = new Person<>("Ilya",18);
        //person  = new Person<>("Olivia",24);
        System.out.println(person);

    }
}
