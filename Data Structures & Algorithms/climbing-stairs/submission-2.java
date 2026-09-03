class Solution {

    int []  dp ;


    int helper (int n ){

        if (n==0){
            return 1 ; 
        }
        if (dp[n]!=-1){
            return dp[n];
        }

        dp[n]=helper(n-1);

        if (n>1){
            dp[n]+= helper(n-2);
        }

        return dp[n]  ; 
    }
    public int climbStairs(int n) {

        dp = new int [n+1];
        for(int i = 0 ; i<=n; i++){
            dp[i]=-1;
        }

        return helper ( n );
        
    }
}
