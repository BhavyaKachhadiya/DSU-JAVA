class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class p2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.deposit(5000);
            account.withdraw(2000);
            account.withdraw(1500);
            account.withdraw(3500); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final Balance: Rs. " + account.getBalance());
    }
}
