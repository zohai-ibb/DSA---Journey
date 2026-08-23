class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            profit = arr[i] - min;
            if(maxProfit < profit) maxProfit = profit;
        }
        return maxProfit;
    }
}