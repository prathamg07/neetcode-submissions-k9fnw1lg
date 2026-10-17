class Solution {

    int dp [];

    int helper( String s , int i){

        if (i<0){
            return 1;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int b= s.charAt(i)-48;
        int left = 0 ;

        if (i>0){
            int a= s.charAt(i-1)-48;
            int pair = a*10 + b;
            if (pair >= 10 && pair < 27){
                left = helper (s , i-2 );
            }

        }
        if (b==0){
            return left ;
        }
        return dp[i]=left + helper ( s , i-1 );
    }
    public int numDecodings(String s) {

        dp=new int[s.length()+1];

        for(int i = 0 ; i < s.length() +1 ; i++){
            dp[i]=-1;
        }

        return helper(s , s.length()-1);
        
    }
}
