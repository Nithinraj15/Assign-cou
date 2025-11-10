package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number must not be empty.");
        }
        if (initialBalance < 0) {
            this.balance = 0.0;
            System.out.println("Initial balance cannot be negative. Setting balance to ₹0.0.");
        } else {
            this.balance = initialBalance;
        }
        this.accountNumber = accountNumber;
        System.out.println("Account successfully created for " + accountNumber + " with balance ₹" + balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited ₹" + amount);
        System.out.println("New balance: ₹" + balance);
    }
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false; 
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: ₹" + balance);
            return false; 
        }
        balance -= amount;
        System.out.println("Successfully withdrawn ₹" + amount);
        System.out.println("New balance: ₹" + balance);
        return true;  
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        try {
            BankAccount acc = new BankAccount("AC12345", 5000);
            acc.displayAccountDetails();
            acc.deposit(1500);      
            acc.withdraw(2000);     
            acc.withdraw(6000);     
            acc.deposit(-500);      
            acc.withdraw(0);        
            System.out.println("Final Balance: ₹" + acc.getBalance());
            System.out.println("------------------------------------------");

            BankAccount invalidAcc = new BankAccount("AC54321", -1000);  
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }
        System.out.println("Encapsulation prevents direct modification of the private balance field.");
    }
}
