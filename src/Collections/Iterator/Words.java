package Collections.Iterator;

public class Words {
    private String fruits;

    public Words(String fruits) {
        this.fruits = fruits;
    }

    public String getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "Words{" +
                "fruits='" + fruits + '\'' +
                '}';
    }
}
