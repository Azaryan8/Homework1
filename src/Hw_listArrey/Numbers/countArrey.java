package Hw_listArrey.Numbers;

import java.util.ArrayList;
import java.util.Comparator;

public class countArrey {
    public static void main(String[] args) {
        ArrayList<Integer> counts = new ArrayList<>();

        counts.add(1);
        counts.add(5);
        counts.add(6);
        counts.add(7);
        counts.add(23);

        System.out.println(counts);

        int maxValue = counts.get(0);

        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i)>maxValue) {
                maxValue = counts.get(i);
            }
            }
        System.out.println("Max count"  +  maxValue);

        counts.sort(Comparator.naturalOrder());
        System.out.println(counts);

        }
    }

