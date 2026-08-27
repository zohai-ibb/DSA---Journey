class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 3; k++) {

            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            for (int i = k + 1; i < nums.length - 2; i++) {

                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {

                    long sum = (long) nums[k]
                             + (long) nums[i]
                             + (long) nums[left]
                             + (long) nums[right];

                    if (sum == (long) target) {

                        res.add(Arrays.asList(
                            nums[k],
                            nums[i],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < (long) target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}