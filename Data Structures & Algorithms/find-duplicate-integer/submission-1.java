class Solution {
    public int findDuplicate(int[] nums) {

        int i=0;

        while (i < nums.length){

            if (nums[Math.abs(nums[i])-1] < 0){
                return Math.abs(nums[i]);
            }

            int k = Math.abs(nums [i]);
            nums[k-1]=nums[k-1]*-1;
            i++;

            }
        

        return nums[i];
        
    }
}
