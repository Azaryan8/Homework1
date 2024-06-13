package My_works.Bank2;

public class BankCard {

        private int number;
        private double balance;
        private BankInformation bankInfo;

        public void BankCart(int number, double balance, BankInformation bankInfo) {
            this.number = number;
            this.balance = balance;
            this.bankInfo = bankInfo;
        }

        // Метод для получения баланса
        public double getBalance() {
            return balance;
        }

        // Метод для пополнения счета
        public double deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Счет пополнен на " + amount);
            } else {
                System.out.println("Ошибка: Сумма должна быть положительной");
            }return balance;
        }

        @Override
        public String toString() {
            return "BankCart{" +
                    "number=" + number +
                    ", balance=" + balance +
                    ", bankInfo=" + bankInfo +
                    '}';
        }
    }

