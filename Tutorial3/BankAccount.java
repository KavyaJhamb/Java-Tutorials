// BankAccount.java
class BankAccount {
    private String accountHolder; // Private attribute
    double balance; // Private attribute
    protected String accountType; // Protected attribute
    public String accountNumber; // Public attribute

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = "Customer"; // Default account type
    }

    // Public method to view balance (customers can only view)
    public void viewBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Protected method to update account type (accessible by subclasses)
    protected void updateAccountType(String newType) {
        this.accountType = newType;
        System.out.println("Account type updated to: " + newType);
    }

    // Private method to update balance (accessible only internally)
    private void updateBalance(double amount) {
        balance += amount;
    }
}

// Employee.java
class Employee extends BankAccount {
    public Employee(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber, 0); // Employees do not have a balance
    }

    // Method to change account type
    public void changeAccountType(BankAccount account, String newType) {
        account.updateAccountType(newType);
    }
}

// Admin.java
class Admin extends BankAccount {
    public Admin(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber, 0); // Admins do not have a balance
    }

    // Method to modify balance
    public void modifyBalance(BankAccount account, double amount) {
        account.deposit(amount); 
        System.out.println("Account balance modified. New Balance: $" + account.balance);
    }
}

// Main.java
 class bankacc {
    public static void main(String[] args) {
        // Create a customer account
        BankAccount customer = new BankAccount("John Doe", "123456", 100.0);
        customer.viewBalance(); // Customer can view balance
        customer.deposit(50); 


        Employee employee = new Employee("Jane Smith", "654321");
        employee.changeAccountType(customer, "Premium"); // Employee can change account type

        // Create an admin object and modify the customer’s balance
        Admin admin = new Admin("Admin User", "000001");
        admin.modifyBalance(customer, 200); // Admin can modify balance
        customer.viewBalance(); // Check the updated balance
    }
}