package aray;
/**
 * array_283MoveZeroes
 */
public class array_283MoveZeroes {
    public static int moveZeroes(int[] nums) {
        int sizeArr = nums.length;
        int j  = 0 ;
        for (int i = 0; i < sizeArr; i++) {
            if( nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
            
        }
        for(;j < sizeArr;j++){
            nums[j] = 0;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(moveZeroes(arr));
        System.out.println("done");
        
    }
}