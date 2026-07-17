public class CountFreq {
    public static void main(String[] args){
        String word = "TarunParashar";
        String name = word.toLowerCase();
        for(int i=0;i<name.length();i++){
            int count = 0;
            char ch = name.charAt(i);
            if(ch == ' '){
                continue;
            }
            for(int j=0;j<name.length();j++){
                if(ch == name.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + " " + count);
        }
    }
}
