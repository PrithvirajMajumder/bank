
public class Account {
  int accountBalance;
  int accountNumber;

  public int giveDeposit(int transactionAmount) {
    accountBalance += transactionAmount;
    return accountBalance;
  }

  public int takeWithdraw(int transactionAmount) {
    accountBalance -= transactionAmount;
    return accountNumber;
  }

  public int getAccountBalance() {
    return accountBalance;
  }

  public Account(int accountBalance, int accountNumber) {
    this.accountBalance = accountBalance;
    this.accountNumber = accountNumber;
  }

  @Override
  public String toString() {
    return "Account [accountBalance=" + accountBalance + ", accountNumber=" + accountNumber + "]";
  }

  public void setAccountBalance(int accountBalance) {
    this.accountBalance = accountBalance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
}