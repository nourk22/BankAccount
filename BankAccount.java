public class BankAccount{

  //Instance Variables
  private double balance;
  private int accountID;
  private String password;

  //1. constructor
  public BankAccount(int a, String p){
    balance = 0.0;
    accountID = a;
    password = p;
  }

  //2. get methods for balance, accountID
  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }


  public static void main(String[] args) {
//tests are in Tester.java
  }

}
