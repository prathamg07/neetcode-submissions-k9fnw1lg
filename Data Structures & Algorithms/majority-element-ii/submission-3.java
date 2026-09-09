class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int c1 = 0 ;
        int count1 =0 ;
        int c2 = 0 ;
        int count2 = 0 ;

        for (int key : nums){
            if (count1<=0){
                c1 = key ;
                count1=1;
            }
            else if (c1 ==key){
                count1++;
            }
            else if (count2<=0){
                c2 = key;
                count2=1;
            }
            else if (c2 ==key){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        ArrayList <Integer> ans = new ArrayList <>();


        int freq1 = 0;
        int freq2 = 0;

        for (int key : nums) {
            if (key == c1) freq1++;
            else if (key == c2) freq2++;
        }

        if (freq1 > nums.length / 3) {
            ans.add(c1);
        }

        if (freq2 > nums.length / 3 && c2 != c1) {
            ans.add(c2);
        }




        return ans;
        
    }
}