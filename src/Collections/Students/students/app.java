package Collections.Students.students;

import Hw_TreeSet.Task2.Students;

import java.util.*;

public class app {
    public static void main(String[] args) {
        List<StudentsName> students = new ArrayList<>();

        students.add(new StudentsName("Ilya"));
        students.add(new StudentsName("Viktoria"));
        students.add(new StudentsName("Misha"));
        students.add(new StudentsName("Maks"));
        students.add(new StudentsName("Anna"));


        System.out.println(students);
        students.sort( new Comparator<StudentsName>() {
            @Override
            public int compare(StudentsName o1, StudentsName o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        // Выводим отсортированный список имен
        for (StudentsName student : students) {
            System.out.println(student.getName());
        }
    }
    }

