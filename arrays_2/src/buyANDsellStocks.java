public class buyANDsellStocks {
    public static int maxProfit(int[] prices) {
        int sell_price=Integer.MIN_VALUE;
        int buy_price=Integer.MAX_VALUE;
        int index=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
                index=i;
            }
        }
        for(int i=0;i<prices.length;i++){
            if(prices[i]>=buy_price && i>=index) {
                if (prices[i] > sell_price) {
                    sell_price = prices[i];
                }
            }
        }
        int  profit=sell_price-buy_price;
        return profit;
    }



//  advance code
    public static int buyandsell(int[]arr){
        int buy_value=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
            if(buy_value<arr[i]){
                int profit=arr[i]-buy_value;
                max_profit=Math.max(profit,max_profit);
            }
            else{
                buy_value=arr[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        System.out.println(buyandsell(arr));

    }
}
