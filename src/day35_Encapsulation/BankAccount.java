package day35_Encapsulation;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        if (accountHolder.isEmpty()||accountHolder.isBlank()||accountHolder==null){
            System.out.println("Invalid name");
            return;
        }
        String specialChars="";
        for (char each:accountHolder.toCharArray()) {
            if (!Character.isLetterOrDigit(each)&& each !=' '){
                specialChars+=each;

            }

        }

        if (specialChars.length()>0){
            System.out.println("Invalid name");
            return;
        }
        if (!Character.isLetter(accountHolder.charAt(0))){
            System.out.println("Invalid name");
            return;
        }
        this.accountHolder=accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber<0){
            System.out.println("Invalid account Number");
            return;
        }
        this.accountNumber = accountNumber;
    }
    public double getBalance(){

        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }


    public void deposit(double deposit){

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }



}
