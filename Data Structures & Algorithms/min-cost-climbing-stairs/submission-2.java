class Solution {

    int [] dp ;

    int helper (int [] cost , int index){

        if (index == 0 ){
            return 0 ;
        }

        if (dp[index]!=0){
            return dp[index];
        }

        int left = helper (cost , index-1 ) + cost[index -1 ];
        int right = 101 ;

        if (index >1){
            right =helper (cost , index-2) + cost[index - 1 ];
        }

        dp[index]= Math.min(left , right);

        return Math.min(dp[index-1] , dp[index] ) ;
    }


    public int minCostClimbingStairs(int[] cost) {

        dp = new int [cost.length +1];

        return helper (cost , cost.length  ) ; 
        
    }
}
