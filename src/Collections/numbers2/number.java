package Collections.numbers2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class number {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(21) - 10); // Генерируем числа от -10 до 10
        }
        System.out.println("Исходный список чисел: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            if (num < 0) {
                iterator.remove();
            }

        }
        System.out.println("Коллекция без отрицаительных цыфор" + numbers);


    }

}
