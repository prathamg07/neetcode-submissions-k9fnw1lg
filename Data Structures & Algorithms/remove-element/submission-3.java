class Solution {
    public int removeElement(int[] nums, int val) {

        int k=0;
        int i=0;
        int n = nums.length;
        while(i<n-k){
            if (nums[i]==val){
                k++;
                nums[i]=nums[n-k];
                continue;
                
            }
            i++;
        }

        return nums.length -k;
        
    }
}