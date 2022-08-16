package aray;
public class array_27_remove {
    public static int removeElement(int[] nums, int val) {

        int sizeN = nums.length;

        for (int i = 0; i < sizeN; ) {
            if(nums[i] == val){
                for (int j = i; j < sizeN - 1; j++) {
                    // dich chuyen cac phan tu sang trai 
                    //va gan gia tri numsI bang val bang gia tri phia sau
                    nums[j]=nums[j+1];
                }
                    sizeN--;
            }else { 
                //khi khong co phan tu nao bang val moi tiep tuc vong lap 
                i++;
            }
        }return sizeN;
    }
    public static int RemoveElement2(int[] nums, int val) {
        int sizeN = nums.length;
        int currindex = 0;
        for (int index = 0; index < sizeN; index++) {
            if(nums[index] != val){
                nums[currindex] = nums[index];
                currindex++; 
            }
   
        }return currindex;
    
    }
    public static void main(String[] args) {
        int[] arr={3,2,3,2,2,2};
        System.out.println(removeElement(arr, 2)); 
        System.out.println("done");
    }

    
}