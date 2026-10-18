class Solution {

    int [][] dp ; 

    int helper (int [] coins , int amount , int i){
        if (amount == 0 ){
            return 0;
        }
        if (i==-1){
            return 1000000 ;
        }

        if (dp[i][amount]!=-1){
            return dp[i][amount];
        }

        int right = Integer.MAX_VALUE / 2;
        int left = 0 ; 

        if (amount >= coins[i]){
            right = 1 + helper(coins , amount - coins[i] , i);
        }

        left = helper(coins , amount , i-1);

        int ans = Math.min(left , right);
        return dp[i][amount]=ans ; 

    }
    public int coinChange(int[] coins, int amount) {

        dp = new int [coins.length+1][amount+1];

        for (int i = 0 ; i < coins.length+1 ; i++){
            for (int j = 0 ; j < amount+1 ; j ++){
                dp[i][j]=-1;
            }
        }

        int ans = helper (coins , amount , coins.length-1);
        return (ans==1000000)?-1:ans;
        
    }
}
