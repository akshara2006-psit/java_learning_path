public class BankAccount {
    private int balance;
    public void setbalance(int balance){
        this.balance=balance;
    }
    public int getbalance(){
        return this.balance;
    }
    public void withdraw(int money){
        if(money>this.balance)
            System.out.println("Sorry you are not left with enough balance to withdraw this amount of money");
        else{
            balance=balance-money;
            System.out.println("RS: "+money+" has been withdrawn from your account");
        }
    }
    public void deposit(int money){
balance=balance+money;
System.out.println("The Rs "+money+" have been credited to your account");
    }
}
