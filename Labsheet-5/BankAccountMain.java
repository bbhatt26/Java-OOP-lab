// Q8: Account data is private; operations are performed through methods.
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        boolean success;
        success = amount > 0;
        if (success) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit failed. Amount must be positive.");
        }
    }

    void withdraw(double amount) {
        boolean success;
        success = amount > 0 && amount <= balance;
        if (success) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Aarav", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccount();
        System.out.println("Balance from getter: Rs. " + account.getBalance());
    }
}
