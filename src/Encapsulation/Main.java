package Encapsulation;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccNumber("MD909876");
        bankAccount.setAccBalance(20000.0);

        String accNum = bankAccount.getAccNumber();
        double balance = bankAccount.getAccBalance();

        System.out.println("Account number "+ accNum);
        System.out.println("Account balance "+ balance);
    }
}
