package dowlath.io.practice;

public class SellandBuyStocks {
    public static void main(String[] args) {
        /*
            Buy = When you have to buy the stocks &

            Sell = When you have to sell the stocks.

            Example :

            Condition : Only done once.

            Day1 Day2 Day3 Day4 Day5 Day6
            7     1   5    3    6    4

            Buying Day2 and Selling Day5

            Buy = Day2
            Sell = Day5


            1-6  = 5 it is profit.

            Maximize Profit = 5

            If you are selling on ith day , you buy on the minimum price from 1st -> i-1

            Example :

            7 1 5 3 6 4

            first day buy and sell loss = 0
            second day buy and sell loss = 6
            third day buy and sell minimum price = 5-1 = 4
            fourth day buy and sell minimum price = 3-1 = 2
            fifth day buy and sell minimum price = 6-1 = 5
            sixth day buy and sell minimum price = 4-1 = 3

            Here maximum profit is 5. that is fourth day.

            minimum = a[i] , profit = 0

            for (i = 1 ; i< n ; i++){
              cost = a[i] - minimum ;
              profit = max (profit , cost);
              minimum = min(minimum,a[i]); all the minimum.
              }

              time complexity o(n)
              space complexity o(n)







         */
        int[] a = {7,1,5,3,6,4};
       // int p = buysell(a);
        int maxProfit = maximumProfit(a);
        //System.out.println(p);
        System.out.println(maxProfit);
    }

    private static int maximumProfit(int[] prices){
        int mini = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i = 1;i<n;i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit,cost);
            mini = Math.min(mini,prices[i]);
        }
        return maxProfit;
    }

}
