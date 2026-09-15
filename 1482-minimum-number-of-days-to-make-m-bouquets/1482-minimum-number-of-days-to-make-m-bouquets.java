class Solution {
    public int minDays(int[] arr, int m, int k) {

        // Not enough flowers
        if (((long)m * k) > arr.length) return -1;

        int start = min(arr);
        int end = max(arr);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canBloomFlowers(arr, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int min(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    static int max(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    static boolean canBloomFlowers(int[] arr, int day, int m, int k) {

        int totalBlooms = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= day) {
                count++;
            } else {
                totalBlooms += count / k;
                count = 0;
            }
        }

        // Remaining consecutive flowers
        totalBlooms += count / k;

        return totalBlooms >= m;
    }
}