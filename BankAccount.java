import java.util.Random;

public class BankAccount {
    
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private long accountNumber; // Add the following class attribute: account number. 
                        

    // CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        this.accountNumber = BankAccount.createAccountNumber();
        accounts ++;
        
    }

    // Create a private method that returns a random ten digit account number
    private static long createAccountNumber(){
        Random accountNumber = new Random();
        long number = accountNumber.nextInt((999999999 - 1) + 1) + 1;
        return number;
    }

    // GETTERS
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public static int getAccounts(){
        return accounts;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }
    public long getAccountNumber() {
        return this.accountNumber;
    }
   
    // METHODS (DEPOSITS)
    public double checkingDeposit(double checkingBalance){
        this.checkingBalance += checkingBalance;
        this.totalMoney += checkingBalance;
        return checkingBalance;
    }

    public double savingDeposit(double savingsBalance){
        this.savingsBalance += savingsBalance;
        this.totalMoney += savingsBalance;
        return savingsBalance;
    }

    // METHODS (WITHDRAWAL)
    public void withdrawalChecking (double checkingBalance){
        boolean ok = false;
        if (this.checkingBalance >= checkingBalance){ 
            ok = true;
            this.checkingBalance -= checkingBalance;
            System.out.println("Your checking balance now is: $ " + this.checkingBalance);
        }
        else {
            System.out.println("Not possible: Insufficient funds.");
        }
    }

    public void withdrawalSavings (double savingsBalance){
        boolean ok = false;
        if (this.savingsBalance >= savingsBalance){ 
            ok = true;
            this.savingsBalance -= savingsBalance;
            System.out.println("Your savings balance now is: $ " + this.savingsBalance);
        }
        else {
            System.out.println("Not possible: Insufficient funds.");
        }
    }

    // Display total balance for checking and savings of a particular bank account
    public double displayTotalBalance (){
        this.totalMoney = this.savingsBalance + this.checkingBalance;
        return totalMoney;
    }
}


