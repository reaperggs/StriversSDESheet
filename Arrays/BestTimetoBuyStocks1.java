public class BestTimetoBuyStock1{
    public static void main(Sting[] args){
        //
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            buy = buy > prices[i] ? prices[i] : buy;
            maxprofit = maxprofit < prices[i] - buy ?  prices[i] - buy : maxprofit;
        }
        return maxprofit;
    }
}