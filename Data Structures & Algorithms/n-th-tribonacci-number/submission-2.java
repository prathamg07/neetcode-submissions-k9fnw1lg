class Solution {
    public int tribonacci(int n) {

        if (n==0){
            return 0 ;
        }

        int first = 1 ; 
        int second = 1 ; 
        int third = 0 ; 

        for (int i = 3 ; i < n+1 ; i++){
            int ans = first + second + third ;
 
            third = second ; 
            second =first ; 
            first = ans ; 
        }

        return first ;

        
    }
}