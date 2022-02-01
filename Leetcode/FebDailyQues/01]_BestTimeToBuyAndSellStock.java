package FebDailyQues;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0; i<prices.length; i++){
            if(min_value > prices[i]){
                min_value = prices[i];
            } else if(prices[i]-min_value > max_profit){
                max_profit = prices[i] - min_value;
            }
        }
        return max_profit;
    }
}
