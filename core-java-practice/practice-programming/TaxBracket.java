import java.util.Scanner;

public class TaxBracket {
    public static void main(String[] args) {
        double tax = 0;
        double income;
        String tax_bracket = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter income: ");
        income = scanner.nextDouble();

        if (income <= 50000) {
            tax = income * 0.05;
            tax_bracket = "Tax of 5%";
        } else if (income <= 100000) {
            tax = income * 0.10;
            tax_bracket = "Tax of 10%";
        } else {
            tax = income * 0.20;
            tax_bracket = "Tax of 20%";
        }

        System.out.println("Income: " + income);
        System.out.println("Tax Bracket: " + tax_bracket);
        System.out.println("Tax Amount: " + tax);

        scanner.close();
    }
}