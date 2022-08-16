package aray;

/**
 * sampleStringChar
 */
public class sampleStringChar {

    public static void main(String[] args) {
        // String s = "Hello World2!";
        String test = "loveleetcode";
        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if(Character.isDigit(c) == true){
        //         System.out.print(c + " ");
        //     }
            
        // }
        // char c = 'a';
        // System.out.println("\n "+ c + " = " + (int)c);
        int[] count = new int[123];
        char[] arr = test.toCharArray();
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;

            // count[index]++;
            // System.out.println(count[index]);
            
            System.out.println(c);
        }
        // for (int i = 0; i < arr.length; i++) {
        //     char c = arr[i];

        //     int index = (int)c;

        //     System.out.print(count[index]);

        // }

    }
}