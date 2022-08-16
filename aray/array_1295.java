package aray;

/**
 * array_1295
 
 */
public class array_1295 {
    public static int findNumbers(int[] nums){
        int count = 0;
        for (int i : nums) {

            if (evennumber(i) % 2 ==0 ) {
                count++;
                
            }
        }
        return count;
    }
    private static int evennumber(int nums) {
        // dem so chu so cua 1 so 
        int result = nums;
        int count2 = 0;
        while(result != 0){
            result = result / 10;
            nums = result;
            count2++;
        }
        return count2;
    }
    public static void main(String[] args) {
        int[] nums={555,9031,482,1771};
        System.out.println(findNumbers(nums));
    }
}