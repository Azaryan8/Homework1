package Collections.numbers;

import java.util.HashSet;
import java.util.Set;

public class numberSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(78);
        numbers.add(10);
        numbers.add(10);
        numbers.add(4);

        System.out.println("Origin type" + numbers);
    }
}
