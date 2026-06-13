import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Str1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter your Str2: ");
        String str2 = sc.nextLine();

        boolean result = true;

        if (str1.length() != str2.length()) {
            result = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }

        System.out.println("Using charAt(): " + result);
        System.out.println("Using equals(): " + str1.equals(str2));
    }
}