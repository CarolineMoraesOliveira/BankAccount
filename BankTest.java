public class BankTest {
    
    public static void main(String[] args){
        
        // Create 3 bank accounts
        BankAccount accounts1 = new BankAccount ();
        BankAccount accounts2 = new BankAccount ();
        BankAccount accounts3 = new BankAccount ();

        System.out.println("----Deposit Test----\n");

        accounts1.checkingDeposit(120.50);
        accounts1.savingDeposit(28.00);
        System.out.println("Your balance is: $ " + accounts1.displayTotalBalance());

        accounts2.checkingDeposit(226.50);
        accounts2.savingDeposit(120.00);
        System.out.println("Your balance is: $ " + accounts2.displayTotalBalance());

        accounts3.checkingDeposit(378.50);
        accounts3.savingDeposit(74.00);
        System.out.println("Your balance is: $ " + accounts3.displayTotalBalance());

        
        System.out.println("\n----Withdrawal Test----\n");

        System.out.println("\n---- Test 1 ----\n");

        accounts1.withdrawalChecking(120.00);
        accounts1.withdrawalSavings(30.00);
        accounts1.displayTotalBalance();

        System.out.println("\n---- Test 2----\n");

        accounts2.withdrawalChecking(30.00);
        accounts2.withdrawalSavings(200.00);
        accounts2.displayTotalBalance();


        System.out.println("\n---- Test 3 ----\n");

        accounts3.withdrawalChecking(350.00);
        accounts3.withdrawalSavings(15.00);
        accounts2.displayTotalBalance();


        System.out.println("\n--Static Test - print the number of bank account and the totalMoney)----\n");

        System.out.println("The number of your bank account is: " + accounts1.getAccountNumber());
        System.out.println("The balance of your account is: $ "+ accounts1.displayTotalBalance());
        System.out.println("The number of your bank account is: " + accounts2.getAccountNumber());
        System.out.println("The balance of your account is: $ "+ accounts2.displayTotalBalance());
        System.out.println("The number of your bank account is: " + accounts3.getAccountNumber());
        System.out.println("The balance of your account is: $ "+ accounts3.displayTotalBalance());
    }
}
