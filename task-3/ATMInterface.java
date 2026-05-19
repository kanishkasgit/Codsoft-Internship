import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount user = new BankAccount(10000);

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    user.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = sc.nextDouble();
                    user.withdraw(withdrawAmount);
                    break;

                case 3:
                    user.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
