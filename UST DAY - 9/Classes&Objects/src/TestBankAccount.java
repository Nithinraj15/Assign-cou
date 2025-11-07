class BankAccount{
	String accountNumber;
	String accountHolderName;
	double balance;
	public BankAccount(String accountNumber, String accountHolderName){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		balance = 0.0;
	}
	public void deposit(double amount) {
		if(amount > 0) {
		 balance += amount;
		}else {
			System.out.println("Invalid you Entered!");
		}
	}
	public void withdraw(double amount) {
		if(balance >= amount && amount > 0) {
			balance -= amount;
		}else {
			System.out.println("Insufficient funds");
		}
	}
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("balance: " + balance);
	}
}
public class TestBankAccount {
	public static void main(String args[]) {
	BankAccount account1 = new BankAccount("12345", "Alice Smith");
	account1.deposit(500.0);
	account1.withdraw(150.0);
	account1.displayAccountDetails();

	BankAccount account2 = new BankAccount("67890", "Bob Johnson");
	account2.deposit(1000.0);
	account2.withdraw(1200.0); 
	account2.displayAccountDetails();
	}
}
