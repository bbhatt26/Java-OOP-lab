// Q5: BankAccount and SavingsAccount (min balance of 100 rule)
class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Balance = " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Balance = " + balance);
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied: balance cannot fall below 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Balance = " + balance);
        }
    }
}

public class Q05_BankAccount_SavingsAccount {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(500);
        acc.deposit(200);      // 700
        acc.withdraw(300);     // 400
        acc.withdraw(350);     // denied (would leave 50)
        acc.withdraw(300);     // 100 -> allowed
    }
}
