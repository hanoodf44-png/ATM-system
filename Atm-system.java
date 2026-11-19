
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {
    public static void main(String[] args) { 
   Scanner input = new Scanner(System.in);  
        int correctPIN = 1010;
        int enterPIN;
        int attempts = 0;
        double balance = 1000;
        int choice;
        
String[] transactions = new String[100];
int transactionCount = 0;

System.out.println("Welcome to ATM System");
while (attempts < 3) {

 System.out.print("Enter the PIN: ");
  enterPIN = input.nextInt();

 if (enterPIN == correctPIN) {
 System.out.println("Login Successful");
 break;
 } else {
 attempts++;
 System.out.println("Wrong PIN,Try Again");

}
}
if (attempts == 3) {
System.out.println("Your account is locked.");
} else {

 while (true) {
System.out.println("\n===== ATM MENU =====");
System.out.println("1. Check The Balance");
System.out.println("2. Deposit Your Money");
 System.out.println("3. Withdraw Money");
 System.out.println("4. View Transactions");
System.out.println("5. Exit");

                System.out.print("Choose an option: ");
                choice = input.nextInt();
 
                if (choice == 1) {

                    System.out.println("Your Balance: " + balance);

                }
                else if (choice == 2) {

                    System.out.print("Enter deposit amount: ");
                    double amount = input.nextDouble();

                    if (amount > 0 && transactionCount < 100) {

                        balance = balance + amount;

                        transactions[transactionCount] =
                                "Deposited: " + amount;

                        transactionCount++;

System.out.println("Deposit Successful!");

 } else {
   System.out.println("Invalid amount or history is full.");
}

}

else if (choice == 3) {

 System.out.print("Enter withdrawal amount: ");
double amount = input.nextDouble();
if (amount > 0 && amount <= balance && transactionCount < 100) {
    
 balance = balance - amount;
transactions[transactionCount] =
"Withdrawn: " + amount;

transactionCount++;

 System.out.println("Withdrawal Successful!");

} else {
 System.out.println("Insufficient balance or invalid amount.");
                    }
                }
                else if (choice == 4) {

  System.out.println("\nTransaction History:");
    for (int i = 0; i < transactionCount; i++) {

      System.out.println(transactions[i]);
                    }
          if (transactionCount == 0) {
          System.out.println("No transactions found.");
                    }
                }
                else if (choice == 5) {

                    System.out.println("Thank you for using ATM!");
                    break;
                }
                else {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}
              
