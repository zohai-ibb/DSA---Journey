class Solution {
    public void sortColors(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(mid <= end){
            if (arr[mid] == 0){
                swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, end);
                end--;
            }
        }
    }
    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }
}