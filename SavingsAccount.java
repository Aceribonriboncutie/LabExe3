
package savingsaccount;
public class SavingsAccount {

    private double balance;

    public static double interestRate = 0;

 

    // Constructor

    public SavingsAccount() {

        balance = 0;

    }

 

    // Set static interest rate

    public static void setInterestRate(double newRate) {

        interestRate = newRate;

    }

 

    // Get static interest rate

    public static double getInterestRate() {

        return interestRate;

    }

 

    // Get current balance

    public double getBalance() {

        return balance;

    }

 

    // Deposit money

    public void deposit(double amount) {

        balance += amount;

    }

 

    // Withdraw money

    public double withdraw(double amount) {

        if (balance >= amount) {

            balance -= amount;

            return amount;

        } else {

            return 0;

        }

    }

 

    // Add interest

    public void addInterest() {

        double interest = balance * interestRate;

        balance += interest;

    }

 

    // Show balance

    public static void showBalance(SavingsAccount account) {

        System.out.println("Current Balance: ₱" + account.getBalance());

    }

}