class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int count = 0;
        int max = 0;

        int q = 0;

        while (q < arr.length) {

            if (arr[q] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

            q++;
        }

        return max;
    }
}