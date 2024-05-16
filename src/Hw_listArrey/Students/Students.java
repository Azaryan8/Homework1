package Hw_listArrey.Students;

import java.util.ArrayList;

public class Students {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.size();

        students.add("Oleg");
        students.add("Viktor");
        students.add("Viktoria");
        students.add("Ilya");


        System.out.println(students);

        System.out.println("---------");


        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }

        System.out.println("----------");

        students.remove("Ilya");
        System.out.println(students);


    }
    }



