import java.util.Scanner;

class Solution {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0];  
        int maxProfit = 0;         

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(maxProfit(arr));
    }
}
