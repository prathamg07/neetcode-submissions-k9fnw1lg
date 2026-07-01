class Solution {
    public int maxProfit(int[] prices) {

        int profit =0 ;
        int i=0 ;
        int min =100;

        while (i < prices.length){
            
            if (prices[i]<min){
                min = prices[i];
            }

            if (profit < (prices[i]-min)){
                profit = prices[i]-min;
            }

            i++;
        }

        return profit;
        
    }
}
