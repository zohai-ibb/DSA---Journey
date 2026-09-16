class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high = high + num;
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(nums, mid, k)) high = mid - 1;
            else low = mid + 1;
        }
        
        return low;
    }
    private boolean check(int[] nums,int mid,int k) {
        int subarrays = 1, sum = 0;
        
        for (int num : nums) {
            if (sum + num > mid) {
                subarrays++;
                sum = num;
            } else sum += num;
            
            if (subarrays > k) return false;
        }
        
        return true;
    }
}