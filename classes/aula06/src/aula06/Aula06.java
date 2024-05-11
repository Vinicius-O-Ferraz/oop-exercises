package aula05;

public class Aula05 {
    public static void main(String[] args){
        BankAccount bankaccount1 = new BankAccount(123456789,"Paulinho");
        bankaccount1.openBankAccount("CC");

        System.out.println(bankaccount1.getBalance());
        System.out.println(bankaccount1.getType());
        bankaccount1.getBalance();
        bankaccount1.getType();
    }
}
