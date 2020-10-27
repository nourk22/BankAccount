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

  //for testing setPassword
  //public String getPassword(){
    //return password;
  //}

  //4a. deposit $$
  public boolean deposit(double amount){
    //System.out.println(amount);
    if (amount>=0){
      balance+=amount;
      //System.out.println(balance);
    }
    return amount>=0;
  }

  //4b. withdraw $$
  public boolean withdraw(double amount){
    //System.out.println(amount);
    if (amount>=0 && amount<=balance){
      balance = balance - amount;
      //System.out.println(balance);
      return true;
    }
    return false;
  }

  //5. showing accountID and balance
  public String toString(){
    return (accountID+"\t"+balance);
  }

  public static void main(String[] args) {
//test cases are in BankAccountTester.java
  }

}
