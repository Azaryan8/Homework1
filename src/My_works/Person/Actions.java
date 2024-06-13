package My_works.Person;

public class Actions {


    private boolean fullName;

    public void move(Person person) {
        System.out.println(this.fullName + " передвигается.");
    }

    // Метод talk()
    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }
}
