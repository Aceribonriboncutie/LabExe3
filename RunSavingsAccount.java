
package savingsaccount;

import java.util.Scanner;

 

public class RunSavingsAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount();

 

        System.out.print("Enter interest rate (e.g. 0.05 for 5%): ");

        double rate = scanner.nextDouble();

        SavingsAccount.setInterestRate(rate);

 

        System.out.print("Enter amount to deposit: ₱");

        double initialDeposit = scanner.nextDouble();

        savings.deposit(initialDeposit);

 

        System.out.print("Press D to deposit again or W to withdraw: ");

        char choice = scanner.next().toUpperCase().charAt(0);

 

        if (choice == 'D') {

            System.out.print("Enter amount to deposit: ₱");

            double amount = scanner.nextDouble();

            savings.deposit(amount);

        } else if (choice == 'W') {

            System.out.print("Enter amount to withdraw: ₱");

            double amount = scanner.nextDouble();

            double withdrawn = savings.withdraw(amount);

            if (withdrawn == 0) {

                System.out.println("Insufficient balance.");

            } else {

                System.out.println("You withdrew ₱" + withdrawn);

            }

        } else {

            System.out.println("Invalid option.");

        }

 

        // Show current balance

        SavingsAccount.showBalance(savings);

 

        // Add interest if balance > 1000

        if (savings.getBalance() > 1000) {

            savings.addInterest();

            System.out.println("Interest applied.");

            SavingsAccount.showBalance(savings);

        }

 

        scanner.close();

    }

}