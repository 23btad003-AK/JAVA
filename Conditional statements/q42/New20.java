import java.util.Scanner;

public class New20{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 10000, amount;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your Balance is: " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Updated Balance: " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                amount = sc.nextDouble();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }

    
    }
}
