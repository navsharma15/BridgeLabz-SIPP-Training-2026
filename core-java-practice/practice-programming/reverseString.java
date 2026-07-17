public class reverseString {
    public static void main(String[] args) {

        String original = "I Love Coding";

        String[] arr = original.split("");

        String reversed = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i];
        }

        System.out.println(reversed);
    }
}


// public class reverseString {
//     public static void main(String[] args){
//         System.out.println("Hello World!");

//         String original = "I Love Coding";
//         String reversed = "";

//         for (int i = 0; i < original.length(); i++){

//             reversed = original.charAt(i) + reversed;
//         }
//         System.out.println(reversed);

//     }
// }
