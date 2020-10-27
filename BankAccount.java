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

  //3. set method for password
  public void setPassword(String newPass){
    password = newPass;
  }

  //4a. deposit $$
  public boolean deposit(double amount){
    if (amount>=0){
      balance+=amount;
    }
    return amount>=0;
  }

  //4b. withdraw $$
  public boolean withdraw(double amount){
    if (amount>=0 && amount<=balance){
      balance = balance - amount;
      return true;
    }
    return false;
  }

  //5. showing accountID and balance
  //public

  public static void main(String[] args) {
//tests are in Tester.java
  }

}
