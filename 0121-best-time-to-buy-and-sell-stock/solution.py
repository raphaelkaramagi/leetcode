class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minPrice = float('inf')
        maxProfit = 0

        for price in prices:
            if price < minPrice:
                minPrice = price
            maxProfit = max(maxProfit, price-minPrice)
        return maxProfit
