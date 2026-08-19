class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int xorr = 0;

        // XOR all elements. Duplicates cancel out, leaving the single element.
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }

        return xorr;
    }
}