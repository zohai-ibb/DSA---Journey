class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ne=1,po=0;
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                r[ne]=nums[i];
                ne+=2;


            }
            else{
                r[po]=nums[i];
                po+=2;
            }
        }return r;
    }
}