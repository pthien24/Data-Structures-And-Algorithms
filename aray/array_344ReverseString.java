package aray;

public class array_344ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            // thuat toan sau:doi cho cua hai phan tu i va j


            i++;
            j--;
            // hai con tro i va j se di chuyen lon hon 1 vi tri
        }
        
    }
// hai con tro dao nguoc mang

    

    public static void main(String[] args) {
        char[] s = {'h','a','i'};
        array_344ReverseString a = new array_344ReverseString();
        a.reverseString(s);
        for(char c : s){
            System.out.print(c);
        }
        
    }
}
