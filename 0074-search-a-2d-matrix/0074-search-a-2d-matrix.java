// class Solution {
//     public boolean searchMatrix(int[][] arr, int target) {
//         int m = arr.length;
//         int n = arr[0].length;

//         int left = 0;
//         int right = m * n - 1;

//         while(left <= right){

//             int mid = left + (right - left)/2;
//             if(arr[mid/n][mid%n] == target)
//                 return true;
//             else if(arr[mid/m][mid%n] > target){
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return false;

//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}