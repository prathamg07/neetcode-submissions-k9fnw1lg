class Solution {

    public boolean check (int [] nums , int mid , int high ){
        if (mid < nums.length && nums[mid]<= nums[high]){
            return true;
        }
        else{
            return false;
        }
    }
    public int findMin(int[] nums) {

        int low = 0 ;
        int high = nums.length-1;
        int mid=0;

        while (high > low ){

            mid = low + (high - low )/2;

            if (check(nums , mid , high)){
                high=mid;
            }
            else {
                low = mid+1;
            }

        }

        return nums[(low)%nums.length] ;
        
    }
}
