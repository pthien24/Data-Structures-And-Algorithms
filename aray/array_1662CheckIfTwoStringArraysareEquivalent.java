package aray;

public class array_1662CheckIfTwoStringArraysareEquivalent {
    public boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        String r1 = "";
        String r2 = "";
        for(String s : word1) {
            r1 += s;
        }
        for (String c : word2) {
            r2 += c;
        }


        return r1.equals(r2);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }


        return sb1.toString().equals(sb2.toString());
    }


    public static void main(String[] args) {
        
    }
    
}
