public class strRev {
    public static void main(String[] args) {
        String str = "I love Coding";
        String[] word = str.split(" ");
        String rev = " ";
        for(int i=word[2].length()-1;i>=0;i--){
            rev = rev + word[2].charAt(i);
        }
        System.out.print(word[0] + " " + word[1] + " " + rev);
    }
}



