class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var buy=prices[0]
        var sell=0
            for(i in 1 until prices.size){
                    buy=minOf(buy,prices[i])
                    sell=maxOf(sell,prices[i]-buy)    
            }

return sell
    }
}