package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WordsChange {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("banan");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");

        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("apple")) {
                iterator.remove();
                fruits.add("orange");
            }
        }

        // Выводим список после замены слов
        System.out.println("Список после замены слов: " + fruits);
    }
}


