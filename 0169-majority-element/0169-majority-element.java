class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Find majority element
        for (int num : map.keySet()) {

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }
}