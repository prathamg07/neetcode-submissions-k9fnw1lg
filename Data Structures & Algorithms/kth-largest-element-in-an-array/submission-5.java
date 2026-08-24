class Solution {

    int helper (int [] nums , int i , int j , int k ){


        int lo = i ;
        int hi = j ;

        if (lo >= hi ){
            return nums[lo];
        }

        int pivot = nums[i + (j - i + 1) / 2];

        while (i <= j){
            while (nums[i] < pivot){
                i++ ;
            }
            while (nums[j]> pivot){
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
         if (k>j){
            return helper(nums, Math.max(j + 1, lo + 1), hi, k);
        }
        else {
            return helper (nums , lo , j , k);
        }

    }
    public int findKthLargest(int[] nums, int k) {

       return helper (nums , 0 , nums.length-1 , nums.length-k );
        
    }
}
