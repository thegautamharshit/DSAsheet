public class Q8_Buy_Sell_Stock {
    public static void main(String[] args) {
        int[] n = {7,1,5,3,6,4};
        int[] n1 = {7,6,4,3,2,1};
        int[] n2 ={2,4,1};
        int ans = maxProfit(n1);
        int ans1 = maxProfit(n);
        int ans2 = maxProfit(n2);
        System.out.println(ans1);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static int maxProfit(int[] prices) {

        int buy_price = prices[0];
        int max_profit = 0;
        if (prices == null || prices.length <= 1) {
            return max_profit;
        }

        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }else{
                int current_profit = prices[i]-buy_price;
                max_profit = Math.max(max_profit,current_profit);
            }
        }
        return max_profit;
    }

}
