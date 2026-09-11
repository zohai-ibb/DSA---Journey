class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Make mid even
            if (mid % 2 == 1)
                mid--;

            // Pair is correct, single is on the right
            if (arr[mid] == arr[mid + 1]) {
                start = mid + 2;
            }
            // Pair is broken, single is on the left (or mid)
            else {
                end = mid;
            }
        }

        return arr[start];
    }
}