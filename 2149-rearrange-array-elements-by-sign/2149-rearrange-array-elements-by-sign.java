class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] positive = new int[arr.length/2];
        int[] negative = new int[arr.length/2];
        int p = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                negative[n] = arr[i];
                n++;
            } else {
                positive[p] = arr[i];
                p++;
            }
        }

        p = 0;
        n = 0;

        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = positive[p];
            p++;
        }

        for (int i = 1; i < arr.length; i = i + 2) {
            arr[i] = negative[n];
            n++;
        }

        return arr;
    }
}