class Solution {
    public int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }


        while(start < end){

            int mid = start + (end - start) / 2;

            int sum = 0;
            int subArray = 1;

            for(int num : arr){
                if(sum + num > mid){
                    sum = num;
                    subArray++;
                } else {
                    sum += num;
                }
            }
            if(subArray > m){
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}