class Solution {
    public int threeSumClosest(int[] arr, int target) {
       Arrays.sort(arr);
        int finalSum = arr[0] + arr[1] + arr[2];
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target)
                    return sum;
                else if(sum > target)
                    right--;
                else
                    left++;

                int difference = Math.abs(sum - target);
                if(difference < minDifference) {
                    minDifference = difference;
                    finalSum = sum;
                }
            }
        }
        return finalSum;
    }
}