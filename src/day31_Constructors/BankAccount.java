package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void getInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){

        System.out.println("Your available balance is "+balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Deposit amount has to be positive number");
        return;}

        balance+=amount;
    }

    public void withdraw(double amount) {
        if (amount > balance){ System.out.println("Insufficient balance");
    return;}
        if (amount<=0){
            System.out.println("Amount has to be positive");
            return;
        }

        balance-=amount;
    }



}
