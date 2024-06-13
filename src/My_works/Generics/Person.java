package My_works.Generics;

public class Person <T,P> {
    private T name;
    private P age;

    public Person(T name,P age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public P getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

