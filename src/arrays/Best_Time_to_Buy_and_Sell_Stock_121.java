package arrays;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;  // Update maxProfit if we find a better selling price
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int [] array = {7,1,5,3,6,4};

        maxProfit(array);

        System.out.println(maxProfit(array));

    }

}
