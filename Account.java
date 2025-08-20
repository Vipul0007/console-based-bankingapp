class Account {
  private long accountNumber;
  private String accountHolderName;
  private double balance;

  public Account(long accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      System.out.println("Deposit successful. New balance: " + this.balance);
    } else {
      // if someone deposit negative amount to the account
      System.out.println("Error: Deposit Amount must be positive");
    }
  }

  public void withdraw(double amount) {
    // if withdrawn is of less that 0
    if (amount <= 0) {
      System.out.println("Error: Withdrawn amount should be greater than 0");
      return;
    }
    // on deduction there is insufficient balance left in the account
    if ((balance - amount) >= 0) {
      balance -= amount;
      System.out.println("Withdrawn Successful. New balance: " + this.balance);
    } else {
      System.out.println("Error: Insufficient funds to complete the transaction");
    }
  }

}