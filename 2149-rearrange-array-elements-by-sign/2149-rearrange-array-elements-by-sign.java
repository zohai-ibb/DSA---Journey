class Solution {
    public int[] rearrangeArray(int[] arr) {
        int result[] = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                result[negIndex] = arr[i];
                negIndex = negIndex + 2;
            } else {
                result[posIndex] = arr[i];
                posIndex = posIndex + 2;
            }
        }
        return result;
    }
}