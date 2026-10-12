
class BankAccount {
    private double balance;

    BankAccount(double b) {
        balance = b;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class Q7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.displayBalance();
    }
}
