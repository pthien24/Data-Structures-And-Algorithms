package aray;
/**
 * arr_217_ContainsDuplicate
 */
public class arr_217_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {           
                if(nums[i] == nums[j]){
                    return true;
            } 
            } 
  
        }return false;
                
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(containsDuplicate(arr));
        
    }
}