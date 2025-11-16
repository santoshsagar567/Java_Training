import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Random;

// Customer Class
class Customer {
    private String customerId;
    private String name;
    private String address;
    private List<Account> accounts; // One-to-Many relationship with Account

    public static String generatePrefixedCustomerID(String prefix, int numericLength) {
        if (numericLength <= 0) {
            throw new IllegalArgumentException("Numeric length must be a positive integer.");
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder(prefix);

        // Ensure the first digit of the numeric part is not zero for a fixed-length ID
        sb.append(random.nextInt(9) + 1);

        for (int i = 1; i < numericLength; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public Customer(String name, String address) {
        //this.customerId = UUID.randomUUID().toString(); // Generate unique ID
        this.customerId = generatePrefixedCustomerID("CUST", 6); // Generate unique ID - "CUST" followed by 6 digits
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Address: " + address;
    }
}

// Account Class
class Account {
    private String accountNumber;
    private double balance;
    private Customer owner; // Many-to-One relationship with Customer
    private List<Transaction> transactions; // One-to-Many relationship with Transaction

    public static String generatePrefixedAccountNum(String prefix, int numericLength) {
        if (numericLength <= 0) {
            throw new IllegalArgumentException("Numeric length must be a positive integer.");
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder(prefix);

        // Ensure the first digit of the numeric part is not zero for a fixed-length ID
        sb.append(random.nextInt(9) + 1);

        for (int i = 1; i < numericLength; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public Account(Customer owner, double initialBalance) {
        this.accountNumber = generatePrefixedAccountNum("594700",10); // Generate unique 16 digit account number
        this.owner = owner;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            transactions.add(new Transaction(this, "Deposit", amount));
            System.out.println("Deposited " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            transactions.add(new Transaction(this, "Withdrawal", amount));
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Owner: " + owner.getName();
    }
}

// Transaction Class
class Transaction {
    private String transactionId;
    private Account account; // Many-to-One relationship with Account
    private String type; // e.g., "Deposit", "Withdrawal"
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(Account account, String type, double amount) {
        this.transactionId = UUID.randomUUID().toString(); // Generate unique ID
        this.account = account;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Account: " + account.getAccountNumber() +
                ", Type: " + type + ", Amount: " + amount + ", Timestamp: " + timestamp;
    }
}

// BankApp Main Class
public class BasicsPrct_25_BankApp {
    public static void main(String[] args) {
        // Create a customer
        Customer alice = new Customer("Alice Parker", "846 Main St");
        System.out.println(alice);

        // Create an account for Alice
        Account aliceChecking = new Account(alice, 1000.0);
        alice.addAccount(aliceChecking);
        System.out.println(aliceChecking);

        // Perform some transactions
        aliceChecking.deposit(500.0);
        aliceChecking.withdraw(200.0);
        aliceChecking.withdraw(1500.0); // Attempt to overdraw

        System.out.println("\nAlice's Account Details after transactions:");
        System.out.println(aliceChecking);

        System.out.println("\nAlice's Transaction History:");
        for (Transaction t : aliceChecking.getTransactions()) {
            System.out.println(t);
        }

        System.out.println("\n #######--------------------------------------------------#######");
        // Create another customer and account
        Customer bob = new Customer("Bob Johnson", "456 Oak Ave");
        Account bobSavings = new Account(bob, 5000.0);
        bob.addAccount(bobSavings);
        System.out.println("\n" + bob);
        System.out.println(bobSavings);

        // Perform some transactions
        bobSavings.withdraw(850.0);

        System.out.println("\nBob's Account Details after transactions:");
        System.out.println(bobSavings);

        System.out.println("\nBob's Transaction History:");
        for (Transaction t : bobSavings.getTransactions()) {
            System.out.println(t);
        }

        System.out.println("\n #######--------------------------------------------------#######");
        // Create another customer and account
        Customer oliver = new Customer("Oliver Pete", "93 Mid West");
        Account oliverSavings = new Account(oliver, 710.0);
        bob.addAccount(oliverSavings);
        System.out.println("\n" + oliver);
        System.out.println(oliverSavings);
        /*System.out.println("\nOliver's Transaction History:");
        for (Transaction t : oliverSavings.getTransactions()) {
            System.out.println(t);
        } */

    }
}