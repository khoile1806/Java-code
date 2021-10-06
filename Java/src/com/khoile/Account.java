package Java.src.com.khoile;
import java .util.Scanner;

public class Account {
    int number_account;
    int number_balance;

    Scanner scanner = new Scanner(System.in);

    void showData(){
        System.out.println("number account: " + number_account);
        System.out.println("number balance: " + number_balance);
    }

    void deposit(){
        System.out.println("so du cong them");
        int amount = scanner.nextInt();
        number_balance += amount;
    }

    void withdraw(){
        System.out.println("So lien can rut");
        int amount = scanner.nextInt();
        number_balance -= amount;
    }
}

