// Problem 121. Best Time to Buy and Sell Stock (EASY) 
// Attempt 1 - misunderstoodf the poble, based one example cases (fully read and understand PROBLEM stateement,
// not memorizing example cases
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Problem_121 {

    // PLAN:
        //  insight: For each day, the best profit if we sell that day = current price - minimum price seen so far
        // We only need to track: (1) the lowest price we've seen, (2) the best profit we've found
        //
        // 0.  if prices array is empty, return 0
        // 1. minPrice = prices[0] (first price is our initial minimum)
        // 2. maxProfit = 0 (worst case: no profit)
        // 3. loop through prices starting from index 1 (i=1 to prices.length-1)
        //      4. Calculate profit if we sell today: profit = prices[i] - minPrice
        //      5. Update maxProfit if this profit is better: maxProfit = Math.max(maxProfit, profit)
        //      6. Update minPrice if today's price is lower: minPrice = Math.min(minPrice, prices[i])
        // 7. Return maxProfit



    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int minPrice = prices[0];  
        int maxProfit = 0;         
        
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        Problem_121 problem_121 = new Problem_121();
        int[] prices = {2,1,2,0,1};
        System.out.println(problem_121.maxProfit(prices));
    }

}
