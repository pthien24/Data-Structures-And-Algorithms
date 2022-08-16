package aray;

public class array_1089_Duplicate_Zeros {
    public static void duplicateZeros2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == 0){
                // code nay hoi ao ma dung chi hieu so so tim dc tren mang
                for (int j = n-1; j > i ; j--) 
                {
                    arr[j]=arr[j-1];
                }
                i++;


            }
            
        }
    }
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == 0){
                // dich mang sang phai
                for(int j = n -1 ; j > i+1; j-- ){
                    arr[j] = arr[j-1];

                }
                // if ( i  +1 < n){
                    // roi gan gia tri bang 0
                    arr[i+1] = 0;
                    i++;

                // }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for (int i : arr) {
            
            System.out.println(i); 
        }
        
        // System.out.println("done");
    }
    
}
