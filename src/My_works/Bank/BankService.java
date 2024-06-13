package My_works.Bank;

public class BankService {

    public double getBalance() {
        double balance = 500;
        return balance;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            double balance = amount;
            System.out.println("Счет пополнен на " + amount);
        } else {
            System.out.println("Ошибка: Сумма должна быть положительной");
        }
    }}
