package My_works.Bank2;

import My_works.Bank.BankCart;

import java.util.ArrayList;
import java.util.List;

public class Client {

        public static void main(String[] args) {
            List<BankCart> bankCarts = new ArrayList<>();

            BankInformation bankInfo = new BankInformation("Olivia", 24, 17);
            BankCart bankCart = new BankCart(12345678, 1000.0, bankInfo);

            bankCarts.add(bankCart);

            // Пополнение счета
            bankCart.deposit(500);

            // Вывод информации о всех банковских картах
            for (BankCart cart : bankCarts) {
                System.out.println(cart);
            }

            bankCart.deposit(1000);
            System.out.println(bankCart);
        }}

