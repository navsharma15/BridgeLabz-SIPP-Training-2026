import java.util.Scanner;

public class ElectricityBill {
    double units;
    double amount;

    // Constructor
    public ElectricityBill(double units) {
        this.units = units;

        amount = (units <= 50) ? 5 :
                 (units <= 100) ? 10 :
                 (units <= 200) ? 15 :
                 (units <= 300) ? 20 : 30;
    }

    public void generateBill() {
        System.out.println("-----------------------------------------------");
        System.out.println("WELCOME TO ELECTRICITY BILL BOARD");
        System.out.println("Total Units Consumed -> " + units);
        System.out.println("Total Bill amount to be paid -> " + amount);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = scanner.nextDouble();

        ElectricityBill bill = new ElectricityBill(units);
        bill.generateBill();

        scanner.close();
    }
}