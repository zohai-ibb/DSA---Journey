class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays
        while (j < n && i < m) {

            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of nums2
        while (j < n) {
            res[k] = nums2[j];
            j++;
            k++;
        }

        // Remaining elements of nums1
        while (i < m) {
            res[k] = nums1[i];
            i++;
            k++;
        }

        // Copy result back into nums1
        for (int p = 0; p < m + n; p++) {
            nums1[p] = res[p];
        }
    }
}