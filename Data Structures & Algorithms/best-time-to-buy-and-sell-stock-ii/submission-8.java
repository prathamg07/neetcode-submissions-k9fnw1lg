class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int n = 0;
        int index;

        while (n < prices.length -1) {
            while (n < prices.length -1 && prices[n]>=prices[n + 1]) {
                n++;
            }
            index = n;
            while (n < prices.length -1 && prices[n]<=prices[n + 1]) {
                n++;
            }
            profit += prices[n] -prices[index];
        }
        return profit;
    }
}