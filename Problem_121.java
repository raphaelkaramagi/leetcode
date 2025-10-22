import java.util.*;

// Problem 121. Best Time to Buy and Sell Stock (EASY) 
// Attempt 1 - misunderstoodf the poble, based one example cases (fully read and understand PROBLEM stateement,
// not memorizing example cases

public class Problem_121 {


    public int maxProfit(int[] prices) {
        // 0. create a temp duplicate of prices
        //1. Arrays.sort(temp) and get value of index 0 for minPrice : O(nlogn)
        // 2. Turn prices intoArrayList
        // 3. do prices.indexOf(minPrice) and store minIndex
        // 3.5 Create value maxSellingDay = minPrice;
        // 4. start a loop from i = minIndex 
            // if prices(i) > maxSellingDay
                // maxSellingDay = prices(i)

        // 5. Return maxSellingDay - minPrice

        int[] temp = Arrays.copyOf(prices, prices.length);

        Arrays.sort(temp);
        int minPrice = temp[0];
        System.out.println("minPrice is:"+minPrice);

        
        List<Integer> priceList = new ArrayList<>();
        for(int i=0; i<prices.length;i++){
            priceList.add(prices[i]);
        }
        
        int minIndex = priceList.indexOf(minPrice);

        int maxSellingPrice = minPrice;
        for(int i = minIndex + 1; i < prices.length; i++){
            if(prices[i] >  maxSellingPrice) {
                maxSellingPrice = prices[i];
            }
        }
        int profit = maxSellingPrice - minPrice;
        
        return profit;
    }

    public static void main(String[] args) {
        Problem_121 problem_121 = new Problem_121();
        int[] prices = {7,6,4,3,1};
        System.out.println(problem_121.maxProfit(prices));
    }

}
