import java.util.Scanner;

class BestTime {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;  // Least so far
        int op = 0;  // Overall profit
        int pist = 0;  // Profit if sold today

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            } else {
                pist = prices[i] - lsf;
            }

            if (op < pist) {
                op = pist;
            }
        }

        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user for the prices array
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Creating an instance of Solution and calculating the max profit
        BestTime sol = new BestTime();
        int maxProfit = sol.maxProfit(prices);

        System.out.println("Maximum profit that can be achieved: " + maxProfit);
    }
}
