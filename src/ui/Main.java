package ui;

import java.util.Scanner;
import model.Account;
import service.AccountService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountService service = new AccountService();

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    service.createAccount(new Account(accNo, name, bal));
                    System.out.println("Account Created!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int id = sc.nextInt();

                    Account acc = service.getAccount(id);
                    if (acc != null) {
                        System.out.println("Name: " + acc.getName());
                        System.out.println("Balance: " + acc.getBalance());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int dId = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();

                    service.deposit(dId, amt);
                    System.out.println("Deposited!");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int wId = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wAmt = sc.nextDouble();

                    service.withdraw(wId, wAmt);
                    System.out.println("Withdrawn!");
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
} 