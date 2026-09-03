class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int prev2 = 0 ; 
        int prev = cost[0];

        for (int i = 1 ; i < cost.length ; i++){

            int curr = cost[i] + Math.min(prev , prev2);
            prev2=prev;
            prev = curr ;
        }

        return Math.min(prev , prev2);
        
    }
}
