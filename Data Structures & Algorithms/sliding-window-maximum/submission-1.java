class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int [] arr = new int [nums.length -k +1];

        int left = 0 ;
        int right = k-1;
        int n=0;

        while (right < nums.length){

            int max=-10000;
            int i = left;
            while (i!=right+1){
                if (nums[i]>max){
                    max=nums[i];
                }
                i++;
            }


            arr[n]=max;
            n++;
            left++;
            right ++;
        }
        return arr;
    }
}
