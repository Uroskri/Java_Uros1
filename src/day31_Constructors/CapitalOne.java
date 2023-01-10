package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.getInfo("Ahmet Ozkok",123456778);

        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);

        account1.checkBalance();


        System.out.println("------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.getInfo("Aygun",32143245);
        account2.deposit(10000);

        account2.checkBalance();



    }
}
