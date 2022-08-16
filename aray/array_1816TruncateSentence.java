package aray;

public class array_1816TruncateSentence {

    public static String truncateSentence2(String s, int k) {
        String[] words = s.split(" ");
        String[] result = new String[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = words[i];
        }
        return String.join(" ", result);
    }
    
    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int spacecount = 0;
        for (int i = 0; i < s.length(); ++i) {

            if(s.charAt(i) == ' '){
                spacecount++;
            }
            if(spacecount == k){
                return sb.toString();
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();  
    }

    public static void main(String[] args) {
        String str = "Hello how are you Contestant";

    //  \  System.out.println(str);
        System.out.println(truncateSentence(str, 4));
    }
}

