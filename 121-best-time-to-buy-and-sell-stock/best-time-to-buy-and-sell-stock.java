class Solution {
    public int maxProfit(int[] prices) {
        // Check if the array is empty or has only one element
        if (prices == null || prices.length < 2) {
            return 0; // Return 0 as the maximum profit
        }
        
        // Initialize the minimum element and the maximum profit
        int min = prices[0];
        int profit = 0;
        
        // Loop through the array from index 1
        for (int i = 1; i < prices.length; i++) {
            // Update the minimum element with the smaller element
            min = Math.min(min, prices[i]);
            // Update the maximum profit with the larger difference
            profit = Math.max(profit, prices[i] - min);
        }
        
        // Return the maximum profit
        return profit;
    }
}
