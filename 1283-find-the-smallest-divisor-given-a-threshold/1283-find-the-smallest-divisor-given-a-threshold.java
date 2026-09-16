class Solution {
    public int smallestDivisor(int arr[], int t) {

        int start = 1;
        int end = max(arr);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (possibleDivisor(arr, t, mid)) {
                end = mid - 1;      
            } else {
                start = mid + 1;    
            }
        }

        return start;
    }

    static boolean possibleDivisor(int arr[], int t, int d) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] + d - 1) / d;
        }

        return sum <= t;
    }

    static int max(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        return max;
    }
}