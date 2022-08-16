package aray;


public class array_88 {
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            insertelementintoarray(ai,nums1,m);
            m++;
        }
      
    }
    private static void insertelementintoarray(int ai, int[] nums1, int m) {
        boolean istimdck = false;
        // neu co bat ki  phan tu cua mang nums1 lơn hon phan tu cua mang nums2 dang xet  
        // thì chen phan tu đó của mang nums2  vao vi tri cua phan tu  nums1 ta tim dc 
        // va dich chuyen cac phan tu con lai sang ben phai
        for (int k = 0; k < m; k++) {

            if (nums1[k]>ai){ 
                istimdck = true;
                // dich cac phâng tử từ k sang phải
                for (int i = m-1; i >= k ; i--) {
                    nums1[i+1]=nums1[i];
                }
                nums1[k]=ai;
                break;
             
            }    
        }
            //neu không tìm dc phan tu nao lon hon thi thi chen vi tri cuoi cung 
            if(istimdck == false){
                nums1[m] = ai;
                
        }

    }
    public static void merge(int[] n1, int m, int[] n2, int n) {

        int i =m-1;
        int j =n-1;
        int k =(m+n)-1;
        while(k >= 0){
            if(j < 0){
                n1[k]=n1[i];
                i--;
            }else if( i < 0){
                n1[k]= n2[j];
                j--;
            }else if (n1[i] > n2[j]){
                n1[k] = n1[i];
                i--;
            }else {
                n1[k]= n2[j];
                j--;
            }

            k--;
        }

    }




    public static void main(String[] args) {
        int[] n1 = {0};
        int[] n2 = {1};

        merge(n1, 0, n2, 1);
  

        System.out.println("done");
    }
    
}
