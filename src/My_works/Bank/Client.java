package My_works.Bank;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<BankCart> bankCarts = new ArrayList<>();

        BankInfo bankInfo = new BankInfo("Olivia", 24, 17);
        bankCarts.add(new BankCart(12345678, 1000.0, bankInfo));

        System.out.println(bankCarts);



    }



}
