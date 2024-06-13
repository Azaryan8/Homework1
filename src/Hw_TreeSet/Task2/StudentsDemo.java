package Hw_TreeSet.Task2;

import Hw_TreeSet.Task1.Person;

import java.util.Set;
import java.util.TreeSet;

public class StudentsDemo {
    public static void main(String[] args) {
        Set<Students> students = new TreeSet<>();

        students.add(new Students(1,"Alice"));
        students.add(new Students(3,"Olivia"));
        students.add(new Students(2,"Bob"));





        System.out.println(students);
    }
}
