package ScenarioBased;
import java.util.Scanner;
public class MetroCard {
    public static void main(String[] args) {

        double balance = 600.00;
        Scanner sc = new Scanner(System.in);

        while (balance > 0) {

            System.out.println("Enter Distance in km or Type -1 to exit");
            double distance = sc.nextDouble();

            if (distance == -1) {
                break;
            }

            System.out.println("Your balance is " + balance);

            double fare = (distance <= 5) ? 10 : (distance <= 20) ? 20 : (distance <= 40) ? 30 : 50;

            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Available balance in your card is " + balance);
            } else {
                System.out.println("Balance is insufficient");
            }

            System.out.println("Thank you for travelling in Delhi Metro");
        }

        System.out.println("Card time exceeded or balance is zero");
    }
}