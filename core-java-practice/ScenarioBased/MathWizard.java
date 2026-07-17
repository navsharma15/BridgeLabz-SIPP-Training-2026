import java.util.Scanner;

public class MathWizard{

    // Method to check if a number is prime
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to calculate factorial of a number
    public static int factoriall(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    // Method to calclate fibonacci series of a number
    public static double fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Check Prime");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Calculate Fibonacci");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(isPrime(number)?number+" is prime" : number + " is not prime");
                    break;
                case 2:
                    System.out.println("Factorial of " + number + " is " + factoriall(number));
                    break;
                case 3:
                    System.out.println("Fibonacci of " + number + " is " + fibonacci(number));
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }

        scanner.close();

    }
}