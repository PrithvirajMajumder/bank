public class AccountHolder {
  String accountHolderName;
  int accountNumber;

  public AccountHolder(String accountHolderName, int accountNumber) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
  }

  @Override
  public String toString() {
    return "AccountHolder [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + "]";
  }

}