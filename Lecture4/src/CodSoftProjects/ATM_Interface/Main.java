package CodSoftProjects.ATM_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        BankAccount account = new BankAccount(userName, 1000.00); // Initial balance
        ATM atm = new ATM(account);
        atm.start();
    }
}

