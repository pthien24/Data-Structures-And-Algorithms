package sorting;



public class insertionsort {

    public static void printArray(int  no ,int[] a) {

        System.out.printf("%d: ", no );
        for (int i = 0; i < a.length; i++) {
            System.out.printf( "%d " , a[i] );
        }
        System.out.println();
    }
    public static void insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1]  = key;
            printArray(i, arr);
        }
    }
        public static void main(String[] args) {
        // int[] a = { 8, 2, 7, 3, 5, 9, 1 };
        int[] b = {5, 2, 7, 8, 1, 2 };
        insertionsort(b);
    }  
}
