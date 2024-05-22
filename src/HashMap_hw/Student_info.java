package HashMap_hw;

import Hw_1.Console;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_info {
    public static void main(String[] args) {


        Map<String,Integer> student = new HashMap<>();

        student.put("Vasiliy",12);
        student.put("Victoria",10);
        student.put("Ilya",8);
        student.put("Misha",10);
        student.put("Bek",11);

        System.out.println(student);
        System.out.println(student.get("Victoria"));



    }
}
