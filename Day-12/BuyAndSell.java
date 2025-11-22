public class BuyAndSell {
    public static void profit(int price[]){
    int maxProfit = 0;
    int buyPrice = Integer.MAX_VALUE;

    for(int i=0; i<price.length; i++){
        if(buyPrice < price[i]){
            int todayprofit = price[i] - buyPrice;
            maxProfit = Math.max(maxProfit, todayprofit);
        }else{
            buyPrice = price[i];
        }
    }

    System.out.println("Max Price = "+ maxProfit);
        // int buypice = 0;
        // int sellprice = 0;
        // for(int buy=0; buy<price.length; buy++){
        //     for(int sell=buy+1; sell<price.length; sell++){
        //         if (price[buy] < price[sell]) {
        //             int profit = price[sell] - price[buy]; 
        //            // maxProfit = Math.max(maxProfit, profit);
        //             if(maxProfit < profit){
        //                 maxProfit = profit;
        //                 buypice = price[buy];
        //                 sellprice = price[sell];
        //             }
                    
        //         }
        //     }
        // }

        // System.out.println("Max Price = " + maxProfit);
        // System.out.println("Buy Price = " + buypice);
        // System.out.println("Sell price = " + sellprice);
    }
    public static void main(String args[]){
        int price[] = {15,2,7,20,25};
        profit(price);
    }
}