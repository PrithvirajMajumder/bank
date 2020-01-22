import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
    
    int accountNumber = 1;
    int accountCounter = 0;
    
    AccountHolder customers[] =new AccountHolder[10];
    Account accounts[] = new Account[10];
    Scanner sc = new Scanner(System.in);
    
    sopln("Welcome to State Bank Of India!!");
    while (accountCounter < 10) {
      sopln(
          "These are our services : \nPress:\n1. to open an account\n2. to check your account balance\n3. to deposit in your account\n4. to witdraw from your account\n5. to exit!!");

      switch (sc.nextInt()) {
      case 1:
        sopln("Enter your name : ");
        customers[accountCounter] = new AccountHolder(sc.next(), accountNumber);

        sopln("Make your first deposit (if you want to make a ZERO balance account the press 0) : ");        
        accounts[accountCounter] =  new Account(sc.nextInt(), accountNumber);

        accountNumber++;
        accountCounter++;
        break;
      case 2:
        sopln("Enter your account number : ");
        accountNumber = sc.nextInt();
        if (searchAccount(accountNumber, account) == 1) {
          account[accountCounter].getAccountBalance();
        } else {
          sopln("Your account is not present (Please Create an Account Thank You!!)");
        }
        break;
      case 3:
        sopln("Enter your account number : ");
        accountNumber = sc.nextInt();
        if (searchAccount(accountNumber, account) == 1) {
          sopln("Enter the deposit amount : ");
          transactionMoney = sc.nextInt();
          account[accountCounter].giveDeposit(transactionMoney);
          sopln("Your updated account balance is : ");
          account[accountCounter].getAccountBalance();
        } else {
          sopln("Your account is not present (Please Create an Account Thank You!!)");
        }
        break;
      case 4:
        sopln("Enter your account number : ");
        accountNumber = sc.nextInt();
        if (searchAccount(accountNumber, account) == 1) {
          sopln("Enter the withdraw amount : ");
          transactionMoney = sc.nextInt();
          account[accountCounter].takeWithdraw(transactionMoney);
          sopln("Your updated account balance is : ");
          account[accountCounter].getAccountBalance();
        } else {
          sopln("Your account is not present (Please Create an Account Thank You!!)");
        }
        break;
      default:
        break;
      }
    }
  }

  static void sopln(String printString) {
    System.out.println(printString);
  }

  public static int searchAccount(int item, Account acc[]) {
    int i, flag = 0;
    for (i = 0; i < 10; i++) {
      if (acc[i].accountNumber == item) {
        flag = 1;
      }
    }
    return flag;
  }
}