import java.util.ArrayList;
import java.util.List;

// Create a Bank class that contains multiple Account objects in an array or ArrayList and perform deposit/withdraw operations. //
// Account Class
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance: " + balance);
                return true;
            } else {
                System.out.println("Insufficient balance in account " + accountNumber + " for withdrawal of " + amount);
                return false;
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance;
    }
}

// Bank Class
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added to the bank.");
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Account not found
    }

    public void performDeposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    public void performWithdrawal(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account " + accountNumber + " not found.");
        }
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
            return;
        }
        System.out.println("\n--- All Accounts in the Bank ---");
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("--------------------------------");
    }
}

// Main class for testing
public class BasicsPrct_15_BankSystem {

    public static void main(String[] args) {
        Bank myBank = new Bank();

        // Create and add accounts
        Account acc1 = new Account("ACC001", "Alice Smith", 1000.0);
        Account acc2 = new Account("ACC002", "Bob Johnson", 500.0);
        myBank.addAccount(acc1);
        myBank.addAccount(acc2);

        myBank.displayAllAccounts();

        // Perform operations
        myBank.performDeposit("ACC001", 200.0);
        myBank.performWithdrawal("ACC002", 150.0);
        myBank.performWithdrawal("ACC001", 1500.0); // Insufficient balance
        myBank.performDeposit("ACC003", 50.0); // Account not found

        myBank.displayAllAccounts();

    }
}