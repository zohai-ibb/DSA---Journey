class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int compliment;
        for (int i = 0; i < arr.length; i++) {
            compliment = target - arr[i];
            
            if(map.containsKey(compliment))
                return new int[]{map.get(compliment), i};
            
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}