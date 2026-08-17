class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 1, j = 0;

        while(i != arr.length) {
            if(arr[j] == arr[i]) {
                i++;
            } else {
            j++;
            arr[j] = arr[i];
            i++;
            }
        }
        return j + 1;
    }
}