// Q10: Banking - user-defined (InsufficientFundsException) + built-in (IllegalArgumentException)
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds. Balance = " + balance + ", requested = " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + ". Remaining balance = " + balance);
    }
}

public class Q10_BankingExceptions {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        double[] amounts = {300, 2000, -50};
        for (double amt : amounts) {
            try {
                acc.withdraw(amt);
            } catch (InsufficientFundsException e) {
                System.out.println("User-defined exception: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Built-in exception: " + e.getMessage());
            }
        }
    }
}
