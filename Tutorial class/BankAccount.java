public class BankAccount {
    // Data Members
    private String name;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String name, String accountNumber, String accountType, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount >= 500 && amount <= 50000) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be between 500 and 50000.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to display the name and balance
    public void displayBalance() {
        System.out.println("Name: " + name + ", Current Balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("John Doe", "123456789", "Savings", 10000);

        // Displaying initial balance
        account.displayBalance(); // Output: Name: John Doe, Current Balance: 10000.0

        // Depositing money
        account.deposit(5000); // Output: Deposit successful.

        // Displaying updated balance
        account.displayBalance(); // Output: Name: John Doe, Current Balance: 15000.0

        // Withdrawing money
        account.withdraw(2000); // Output: Withdrawal successful.

        // Displaying updated balance
        account.displayBalance(); // Output: Name: John Doe, Current Balance: 13000.0
    }
}

