package com.mycompany.utilities;
public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("AC1001", "Nithinraj R", 5000);
        BankAccount acc2 = new BankAccount("AC1002", "Merlin", 3000);
        System.out.println("\n--- Initial Account Details ---");
        System.out.println(acc1.getAccountHolderName() + " (" + acc1.getAccountNumber() + "): ₹" + acc1.getBalance());
        System.out.println(acc2.getAccountHolderName() + " (" + acc2.getAccountNumber() + "): ₹" + acc2.getBalance());
        System.out.println("\n--- Performing Transactions on Account 1 ---");
        acc1.deposit(2000);      
        acc1.withdraw(1000);     
        acc1.withdraw(10000);    
        acc1.deposit(-500);      
        acc1.withdraw(0);        
        System.out.println("\n--- Performing Transactions on Account 2 ---");
        acc2.deposit(500);       
        acc2.withdraw(3500);     
        acc2.withdraw(1500);    
        System.out.println("\n--- Account Details After Transactions ---");
        System.out.println(acc1.getAccountHolderName() + " (" + acc1.getAccountNumber() + "): ₹" + acc1.getBalance());
        System.out.println(acc2.getAccountHolderName() + " (" + acc2.getAccountNumber() + "): ₹" + acc2.getBalance());
        System.out.println("\n--- Attempting Direct Access to Private Field ---");
        System.out.println("Cannot directly access or modify 'balance' because it is declared as private in BankAccount.");
        System.out.println("Encapsulation ensures internal state is only changed through methods like deposit() or withdraw().");
    }
}
