package Hw_1;

import java.awt.*;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String point = scanner.nextLine();
        switch (point){
            case "10-12":
                System.out.println("Молодец! копия меня!можешь смотреть 1 час ");
                break;

            case "от 7 до 9":
                System.out.println("Ну можешь лучше!можешь смотреть 45 минут ");
                break;

            case "4-6":
                System.out.println("Ну что с тобой в последнее время!можешь смотреть 15 минут");
                break;

            case "3":
                System.out.println("Нет!это уже не в какие ворота!Минус 30 минут ко времени оценка меньше");
               break;
        }



    }}
