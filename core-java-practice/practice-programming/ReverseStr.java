public class ReverseStr {
    public static void main(String[] args) {
        String str = "I love Coding";
        String[] word = str.split(" ");
        String rev = " ";
        for(int i=word[1].length()-1;i>=0;i--){
            rev = rev + word[1].charAt(i);
        }
        System.out.print(word[0] + " " + rev + " " + word[2]);
    }
}