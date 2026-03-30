package inheritance.com;

class BankAccount{
    int balance;
    int  accountNumber;

    BankAccount(int balance , int accountNumber ){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    void display(){
        System.out.println(balance);
        System.out.println(accountNumber);
    }
}
class SavingAccounts extends BankAccount {
    double interestRate;

    SavingAccounts(int balance, int accountNumber, double interestRate) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }

    void display() {
        super.display();
        System.out.println(interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int balance, int accountNumber, double withdrawalLimit){
        super(balance, accountNumber);
        this.withdrawalLimit =  withdrawalLimit;
    }
    void display(){
        super.display();
        System.out.println(withdrawalLimit);
    }
}
class  FixedDepositAccount extends BankAccount{
    double fixedDeposit;

    FixedDepositAccount(int balance, int accountNumber,double fixedDeposit){
        super(balance, accountNumber);
        this.fixedDeposit = fixedDeposit;
    }
    void displayAccountType(){
        super.display();
        System.out.println(fixedDeposit);
    }

}



public class AccountTypes {
    public static void main(String[]args){
        SavingAccounts sa = new SavingAccounts(10000, 41547, 4.5);
        CheckingAccount ca = new CheckingAccount(50005, 20058, 5000);
        FixedDepositAccount fda = new FixedDepositAccount(78945, 50780, 12);

        System.out.println("Savings Account");
        sa.display();

        System.out.println("Checking Account ");
        ca.display();

        System.out.println(" Fixed Deposit Account ");
        fda.displayAccountType();
    }
}
