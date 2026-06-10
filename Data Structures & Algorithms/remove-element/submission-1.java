class Solution {
    public int removeElement(int[] nums, int val) {

        int k=0;
        int i=0;
        int n = nums.length;
        while(i<n-k){
            if (nums[i]==val){
                k++;
                for(int j=i;j<n-k;j++){
                    nums[j]=nums[j+1];
                }

                i--;
                
            }
            i++;
        }

        return nums.length -k;
        
    }
}