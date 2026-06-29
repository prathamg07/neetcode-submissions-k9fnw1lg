class Solution {
    public int maxArea(int[] heights) {

        int left =0 ;
        int right = heights.length-1;
        int water =0;

        while (left<right){

            int min = heights[left] > heights[right]? heights[right]:heights[left];
            if (water<min*(right-left)){
                water=min*(right-left);
                System.out.println(water);
                System.out.println(left+" "+heights[left]);
                System.out.println(right+ " "+heights[right]);
            }

            if (heights[left]==min){
                left++;
            }
            if (heights[right]==min){
                right--;
            }

        }

        return water;
        
    }
}
