package easy;
public class bestTimeStock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day. 
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock
    Return the maximum profit you can achieve from this transaction, if you cannot achieve any profit, return 0

    Input: prices = [7,1,5,3,6,4]
    Output: 5
    explanation: Buy on day 2 (price=1) and sell on day 5 (price=6), profit = 6-1 = 5. 
    NB buying on day 2 and selling on day 1 is not allowed, coz you must buy before selling.
     */

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6,4};
        System.out.println(checkBestTimeToSellStock(prices));
    }

    private static int checkBestTimeToSellStock(int[] prices) {
        // TODO Auto-generated method stub
        int min = prices[0];
        int profit = 0;

        for(int i=0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
