package aula05;

public class BankAccount {
    public double numAccount;
    public String type;
    public String owner;
    protected float balance;
    protected boolean status;

    public double getNumAccount(){
        return this.numAccount;
    }

    public String getType(){
        return this.type;
    }

    public String getOwner(){
        return this.owner;
    }

    public float getBalance(){
        return this.balance;
    }

    public boolean getStatus(){
        return this.status;
    }

    public BankAccount(double numAccount,String owner){
        numAccount = this.numAccount;
        type = null;
        owner = this.owner;
        this.status = false;
        this.balance = 0;

    }

    public void openBankAccount(String type){
        this.type = type;
        if (this.type.equals("CC")){
            this.balance += 50;
        }else{
            this.balance +=150;
        }
        this.status = true;


    }

    public void closeBankAccount(double numAccount){
        if (this.balance == 0){
            this.status = false;
        }else{
            System.out.println("You cannot close your account. Your balance is different than 0");
        }
    }

    public void deposit(float cash){
        this.balance += cash;
    }

    public void withdraw(float cash){
        this.balance -= cash;
    }

    public void payBankAccountFee(){
        if (this.type.equals("CC")){
            this.balance -= 12;
        }else{
            this.balance -=20;
        }
    }

}
