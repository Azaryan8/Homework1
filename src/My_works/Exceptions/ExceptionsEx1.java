package My_works.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Сканер закрыт.");
        }
    }}