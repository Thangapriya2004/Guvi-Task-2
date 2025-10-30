package Solution3;

public class Account {
    double balance;

    // No-argument constructor
    Account() {
        balance = 0;
    }

    // Parameterized constructor
    Account(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Test it
    public static void main(String[] args) {
        Account acc = new Account(5000);
        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
