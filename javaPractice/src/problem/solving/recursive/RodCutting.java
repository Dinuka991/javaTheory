package problem.solving.recursive;

public class RodCutting {

    public static void main(String[] args) {
        int[] price = {2, 3, 4};

        // Using the recursive approach
        System.out.println("Maximum revenue (Recursive): " + rodCuttingRecursive(price, 3));

        // Using the dynamic programming approach
        System.out.println("Maximum revenue (DP): " + rodCuttingDynamic(price, 3));

        // Using the memoization approach
        System.out.println("Maximum revenue (Memoization): " + rodCuttingMemoization(price, 3));
    }

    // Using the recursive approach
    public static int rodCuttingRecursive(int[] price, int n) {
        // If the rod length is 0, we can't get any money
        if (n == 0) {
            return 0;
        }

        int maxRevenue = Integer.MIN_VALUE;

        // Try cutting the rod at different lengths and find the best way
        for (int i = 1; i <= n; i++) {
            maxRevenue = Math.max(maxRevenue, price[i - 1] + rodCuttingRecursive(price, n - i));
        }

        return maxRevenue;
    }

    // Using the dynamic programming approach
    public static int rodCuttingDynamic(int[] price, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0; // If the rod length is 0, we can't get any money

        // Build the best revenue for each length from 1 to n
        for (int i = 1; i <= n; i++) {
            int maxRevenue = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxRevenue = Math.max(maxRevenue, price[j - 1] + dp[i - j]);
            }
            dp[i] = maxRevenue;
        }

        return dp[n];
    }

    // Using the memoization approach
    public static int rodCuttingMemoization(int[] price, int n) {
        int[] memo = new int[n + 1];
        return rodCuttingMemoizationHelper(price, n, memo);
    }

    // Helper method for memoization
    public static int rodCuttingMemoizationHelper(int[] price, int n, int[] memo) {
        // If we already computed the revenue for length n, return it
        if (memo[n] != 0) {
            return memo[n];
        }

        // If the rod length is 0, we can't get any money
        if (n == 0) {
            return 0;
        }

        int maxRevenue = Integer.MIN_VALUE;

        // Try cutting the rod at different lengths and find the best way
        for (int i = 1; i <= n; i++) {
            maxRevenue = Math.max(maxRevenue, price[i - 1] + rodCuttingMemoizationHelper(price, n - i, memo));
        }

        memo[n] = maxRevenue; // Save the result for future use
        return memo[n];
    }
}
