public class BankAccount{

  //Instance Variables
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    balance = 0.0;
    accountID = a;
    password = p;
  }

  // get methods for balance, accountID
  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  // set method for password
  public void setPassword(String newPass){
    password = newPass;
  }

  //for testing setPassword
  //public String getPassword(){
    //return password;
  //}

  // deposit $$
  public boolean deposit(double amount){
    //System.out.println(amount);
    if (amount>=0){
      balance+=amount;
      //System.out.println(balance);
    }
    return amount>=0;
  }

  // withdraw $$
  public boolean withdraw(double amount){
    //System.out.println(amount);
    if (amount>=0 && amount<=balance){
      balance = balance - amount;
      //System.out.println(balance);
      return true;
    }
    return false;
  }

  // check if the passwords match
  private boolean authenticate(String password){
    return this.password.equals(password);
  }

  // Transfer $$ from this BankAccount to the other
  // only when the password matches, and the withdrawal succeeds.
  public boolean transferTo(BankAccount other, double amount, String password){
    if (withdraw(amount) && authenticate(password)){
      other.deposit(amount);
      return true;
    }
    return false;
  }


  // turn accountID and balance into Strings
  public String toString(){
    return ("#" + accountID + "\t" + "$" + balance);
  }

  public static void main(String[] args) {
//test cases are in BankAccountTester.java
  }

}
