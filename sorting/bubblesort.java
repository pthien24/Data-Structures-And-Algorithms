package sorting;

public class bubblesort {

    public static void printArray(int  no ,int[] a) {

        System.out.printf("%d: ", no );
        for (int i = 0; i < a.length; i++) {
            System.out.printf( "%d " , a[i] );
        }
        System.out.println();
    }
    
    public static void bubblesort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean issorted = true;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    issorted = false;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
            if (issorted) {
                break;
            }
            
            printArray(i, a);
        }

    }

    public static void main(String[] args) {
        int[] a = {8, 2, 7, 3, 5, 9, 1};
        int[] b = {1,2,3,4,5,6,8,7};
        bubblesort(a);
    }
}
