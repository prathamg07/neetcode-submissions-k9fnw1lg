class Solution {

    int helper (int [] nums , int i , int j , int k ){
        int lo = i ;
        int hi = j ;
        if (lo == hi ){
            return nums[lo];
        }
        int pivot = nums[i + (j - i ) / 2];
        while (i <= j){
            while (i <= j && nums[i] < pivot){
                i++ ;
            }
            while (j >= i && nums[j]> pivot){
                j-- ;
            }
            if (i > j){
                break ;
            }
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp ;
            i++;j--;
        }
        if (k <= j) {
            return helper(nums, lo, j, k);
        }

        if (k >= i) {
            return helper(nums, i, hi, k);
        }

        return nums[k];
    }
    public int findKthLargest(int[] nums, int k) {
       return helper (nums , 0 , nums.length-1 , nums.length-k );        
    }
}
