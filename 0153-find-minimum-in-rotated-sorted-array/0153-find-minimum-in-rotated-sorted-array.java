class Solution {
    static int helper(int []arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int findMin(int []arr){
        int pivot = helper(arr);
        if(pivot != -1){
            return arr[pivot];
        }
        return arr[0];
    }
}