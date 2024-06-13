package Hw_2;

import Collections.Students.students.StudentsName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ApartmentApp {
    public static void main(String[] args) {
        List<Flat> flats = new ArrayList<>();


            flats.add(new Flat(2, 50));
            flats.add(new Flat(3, 75));
            flats.add(new Flat(1, 60));
            flats.add(new Flat(4, 80));

        System.out.println(flats);

        System.out.println(flats);

        //flats.sort(new Comparator<Flat>())

        flats.sort(new Comparator<Flat>() {
            @Override
            public int compare(Flat o1, Flat o2) {
                return o1.compareTo(o2);
            }
        });
      //  return o1.name.compareTo(o2.name
        System.out.println(flats);


    }}













