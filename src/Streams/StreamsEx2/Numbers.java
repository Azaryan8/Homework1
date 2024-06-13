package Streams.StreamsEx2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);

        System.out.println("My numbers:" + numbers);

        List<Integer> distinctNumbers = numbers.stream()
                .filter(num-> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("My numbers:" + distinctNumbers);
    }
}
