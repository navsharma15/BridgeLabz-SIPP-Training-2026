import java.util.*;
public class ProductOfNaturalNumbers {
    static long product(int n) {
        if (n == 1) {
            return 1;
        }
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        long result = product(n);

        System.out.println("Product of first " + n + " natural numbers = " + result);

        sc.close();
    }
}