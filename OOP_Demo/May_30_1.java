public class May_30_1 {
public static void main(String[] args) {
    BankAccount A=new BankAccount();
    A.setbalance(15000);
    System.out.println("The balance in the given account is: "+A.getbalance());
    A.withdraw(20000);
    A.deposit(8000);
    System.out.println("Now ur balance is :"+A.getbalance());
}


}
//     Case Study 1: Bank Account

// A bank wants to protect customer balance information.

// Requirements:

// Balance should not be directly accessible.
// User can deposit money.
// User can withdraw money.
// User cannot withdraw more than available balance.

// Questions:

// Which variables should be private?
// Which methods should be public?
// How does encapsulation improve security here?

