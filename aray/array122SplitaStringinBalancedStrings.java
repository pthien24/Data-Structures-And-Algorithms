package aray;

public class array122SplitaStringinBalancedStrings {


    public static int balancedStringSplit(String s) {
        char[] arrr = s.toCharArray();
        int count = 0;
        int cR = 0;
        int cL = 0;
        for(int i = 0; i < arrr.length; i++) {
            char c = arrr[i];
            int index = (int)c;
            if(index == 76){
                cL++;
            }
            else{
                cR++;
            }
            if(cL == cR){
                count++;

            }

        }
        return count;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
