import java.util.Scanner;

class ATM{
    float balance;
    int PIN= 1234;

    public void checkpin(){
        System.out.println("Enter Pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if (enteredpin==PIN){
            menu();
        } else
        {
            System.out.println("Enter a valid PIN");
        }
        checkpin();
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Moeny");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1){
            checkBalance();
        } else if (opt == 2){
            withdrawMoney();

        } else if (opt == 3){
            depositMoney();
        } else if (opt == 4){
            return;
        }
        else {
            System.out.println("Select Valid option");
        }
        menu();
    }

    public void checkBalance(){
        System.out.println("Your Account Balance: " + balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount :  ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();

        if (balance<amt){
            System.out.println("Transaction Failed!, Insufficient Funds");
        }
        else {
            balance = balance - amt;
            System.out.println("Transaction Successful");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter Amount You Wanna Deposit In Your Bank Account : ");
        Scanner sc = new Scanner(System.in);
        float updatedBalance = sc.nextFloat();

        balance = balance + updatedBalance;
        System.out.println("Money Added Successfully to Your Account");
        menu();
    }

}
public class main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
