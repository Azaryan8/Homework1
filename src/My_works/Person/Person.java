package My_works.Person;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName,int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public void move() {
        System.out.println(this.fullName + " передвигается.");
    }

    // Метод talk()
    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }

}
