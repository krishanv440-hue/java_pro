class BankAccount {
    // Member Variables
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Member Function to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    // Member Function to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Member Function to display account info
    void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects
        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 500.0);

        // Perform actions
        acc1.displayAccountInfo();
        acc1.deposit(200);
        acc1.withdraw(150);

        acc2.displayAccountInfo();
        acc2.withdraw(600);
    }
}