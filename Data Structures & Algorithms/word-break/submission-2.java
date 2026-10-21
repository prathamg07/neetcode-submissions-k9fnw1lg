class Solution {

    Boolean [] memo ;


    boolean helper (String s ,List<String> wordDict,  int start ){

        if (wordDict.contains(s.substring(start,s.length()))){
            return true ;
        }

        if (memo[start] != null){
            return memo[start] ;
        }
        for (int i = start ; i < s.length() ; i++){
            if (wordDict.contains(s.substring(start,i+1))){
                boolean check = helper (s, wordDict , i+1); 
                if (check){
                    memo[start]=true;
                    return true ; 
                }
            }
        }

        memo[start] = false;
        return false ;


    }
    public boolean wordBreak(String s, List<String> wordDict) {

        memo = new Boolean [s.length()+1];
       return  helper ( s , wordDict  , 0 );
    }
}