import java.util.Scanner;

public class currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rupee, dollar, euro;

        System.out.println("===== CURRENCY CONVERTER =====");
        System.out.println("1. Rupee to Dollar");
        System.out.println("2. Rupee to Euro");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount in Rupees: ");
        rupee = sc.nextDouble();

        switch (choice) {

            case 1:
                dollar = rupee / 83.0;
                System.out.println("Converted Amount = $" + dollar);
                break;

            case 2:
                euro = rupee / 90.0;
                System.out.println("Converted Amount = €" + euro);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
