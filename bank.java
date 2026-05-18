class BankAccount {

    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {

        if(amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNumber(12345);

        b.deposit(5000);

        b.withdraw(2000);

        System.out.println("Balance: " + b.getBalance());
    }
}