package My_works.Bank;

import My_works.Bank2.BankInformation;

public class BankCart {
    private int number;
    private double balance;
    private BankInfo bankInfo;

    public BankCart(int number,double balance,BankInfo bankInfo) {
        this.number = number;
        this.balance = balance;
        this.bankInfo = bankInfo;
    }

    public BankCart(int number, double balance, BankInformation bankInfo) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    @Override
    public String toString() {
        return "BankCart{" +
                "number=" + number +
                ", balance=" + balance +
                ", bankInfo=" + bankInfo +
                '}';
    }

    public void deposit(int i) {
        if (i > 0){
            balance += i;
            System.out.println("Счет пополнен на сумму" + i);
        }else {
            System.out.println("error");
        }
    }
}


