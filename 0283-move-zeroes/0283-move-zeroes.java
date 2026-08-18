class Solution {
    // public void moveZeroes(int[] arr) {
    //     int nums[] = new int[arr.length];

    //     int i = 0, q = 0;
    //     while(i < arr.length) {
    //         if(arr[i] != 0){
    //             nums[q] = arr[i];
    //             q++;
    //         }
    //         i++;
    //     }
    //     for (int j = 0; j < arr.length; j++) {
    //         arr[j] = nums[j];
    //     }
    // }
    public void moveZeroes(int[] nums) {
        // Pointer to the first zero
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, return
        if (j == -1) return;

        // Start from the next index of first zero
        for (int i = j + 1; i < nums.length; i++) {
            // If current element is non-zero
            if (nums[i] != 0) {
                // Swap with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // Move j to next zero
                j++;
            }
        }
    }
}