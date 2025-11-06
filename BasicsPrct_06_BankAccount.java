
public class BasicsPrct_06_BankAccount {

    // Create a class BankAccount with accountNumber, balance. Add methods deposit(), withdraw(), and checkBalance(). //

    String accountNumber;
    double balance;
    //int amount;

    //non parameterised constructor
    BasicsPrct_06_BankAccount(){
        accountNumber = "436825008713492";
        balance = 5720.95;
    }

    void deposit(int amt){
        System.out.println("Deposited Amount "+amt+" in Account #"+accountNumber);
        System.out.println("Previous Balance : "+balance);
        balance = balance + amt;
        System.out.println("New Balance : "+balance);

    }

    void withdraw(int amt){
        System.out.println("Withdrawn Amount "+amt+" in Account #"+accountNumber);
        System.out.println("Previous Balance : "+balance);
        balance = balance - amt;
        System.out.println("New Balance : "+balance);

    }

    void checkBalance(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);

    }

    public static void main (String[] args) {

     BasicsPrct_06_BankAccount myAcct = new BasicsPrct_06_BankAccount();
        myAcct.deposit(300);
        //myAcct.checkBalance();
        //myAcct.withdraw(800);

    }

}
