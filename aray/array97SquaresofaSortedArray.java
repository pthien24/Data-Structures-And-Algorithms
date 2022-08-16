package aray;

public class array97SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] numsnew = new int[n];
        int l = 0; int r = n-1;
        int index =  n-1;
        while(l <= r){
            if(Math.abs(nums[l]) < Math.abs(nums[r])){
                numsnew[index] = nums[r] * nums[r];
                index--;
                r--;
            }else {
                numsnew[index] = nums[l] * nums[l];
                index--;
                l++;
            }
        }
        return numsnew;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.println(sortedSquares(arr));


     
    }
    }
    

