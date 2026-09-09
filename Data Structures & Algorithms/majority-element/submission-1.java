class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0 ;
        int count = 0 ;

        for (int key : nums){
            if  (count ==0){
                candidate = key ;
            }
            if (key == candidate){
                count++;
            }
            else{
                count --;
            }
        }

        return candidate;
        
    }
}