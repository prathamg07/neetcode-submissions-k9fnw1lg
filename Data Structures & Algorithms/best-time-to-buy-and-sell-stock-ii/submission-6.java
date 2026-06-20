class Solution {
    public int maxProfit(int[] prices) {

        int profit =0;
        int n=0;
        int index=0;
        
        boolean buy=false;
        while (n < prices.length-1){
            while  (n<prices.length-1 && prices[n]>=prices[n+1] && !buy){
                n++;
            }
            buy = true;
            if (n>=prices.length){
                break;
            }
            index = n;
            while (n<prices.length-1 && prices[n]<=prices[n+1]&& buy){
                n++;
            }
            if (n<prices.length){               
                profit+=prices[n]-prices[index];
            }
            buy=false;
        }
        if (buy==true){
        profit+=prices[n-1]-prices[index];
        }
        return profit;
        
    }
}