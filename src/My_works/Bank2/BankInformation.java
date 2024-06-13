package My_works.Bank2;

public class BankInformation {
    private String name;
    private int age;
    private int number;

    public BankInformation(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BankInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}