class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            int index = maxFunc(arr, mid);

            int left = (index > 0) ? arr[mid][index - 1] : Integer.MIN_VALUE;
            int right = (index < arr[0].length - 1) ? arr[mid][index + 1] : Integer.MIN_VALUE;
            int up = (mid > 0) ? arr[mid - 1][index] : Integer.MIN_VALUE;
            int down = (mid < arr.length - 1) ? arr[mid + 1][index] : Integer.MIN_VALUE;

            if(arr[mid][index] > left &&
                    arr[mid][index] > right &&
                    arr[mid][index] > up &&
                    arr[mid][index] > down){

                return new int[]{mid, index};
            }

            else if(up > arr[mid][index]){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
    static int maxFunc(int[][] arr, int row){

        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < arr[0].length; i++){

            if(arr[row][i] > max){
                max = arr[row][i];
                index = i;
            }
        }

        return index;
    }
}