package string;

import java.util.Scanner;

public class CoffeeShop {

    String coffeeType;
    int quantity;

    public double calculatePrice(double price) {
        double bill = price * quantity;
        double gst = bill * 0.18;
        double finalBill = bill + gst;
        return finalBill;
    }

    public void generateBill(double bill) {
        System.out.println("\n----- BILL -----");
        System.out.println("COFFEE TYPE : " + coffeeType);
        System.out.println("QUANTITY    : " + quantity);
        System.out.println("BILL AMOUNT : " + bill);
        System.out.println("THANK YOU FOR VISITING");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Coffee Type or Exit!!");
        System.out.println("1. Cappuccino - 150");
        System.out.println("2. Latte - 245");
        System.out.println("3. Espresso - 300");
        System.out.println("4. Americano - 200");

        int choice = scanner.nextInt();

        CoffeeShop coffee = new CoffeeShop();

        System.out.print("Enter Quantity: ");
        coffee.quantity = scanner.nextInt();

        double bill = 0;

        switch (choice) {

            case 1:
                coffee.coffeeType = "Cappuccino";
                bill = coffee.calculatePrice(150);
                coffee.generateBill(bill);
                break;

            case 2:
                coffee.coffeeType = "Latte";
                bill = coffee.calculatePrice(245);
                coffee.generateBill(bill);
                break;

            case 3:
                coffee.coffeeType = "Espresso";
                bill = coffee.calculatePrice(300);
                coffee.generateBill(bill);
                break;

            case 4:
                coffee.coffeeType = "Americano";
                bill = coffee.calculatePrice(200);
                coffee.generateBill(bill);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        scanner.close();
    }
}