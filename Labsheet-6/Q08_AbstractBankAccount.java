// Q8: Abstract BankAccount with SavingsAccount and CurrentAccount
abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("[Savings] Deposited " + amount + ". Balance = " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("[Savings] Denied: minimum balance of " + MIN_BALANCE + " required.");
        } else {
            balance -= amount;
            System.out.println("[Savings] Withdrawn " + amount + ". Balance = " + balance);
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000;

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("[Current] Deposited " + amount + ". Balance = " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < -OVERDRAFT_LIMIT) {
            System.out.println("[Current] Denied: overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
        } else {
            balance -= amount;
            System.out.println("[Current] Withdrawn " + amount + ". Balance = " + balance);
        }
    }
}

public class Q08_AbstractBankAccount {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount(2000);
        s.deposit(1000);
        s.withdraw(2000);
        s.withdraw(1000);

        BankAccount c = new CurrentAccount(1000);
        c.deposit(500);
        c.withdraw(5000);
        c.withdraw(2000);
    }
}
