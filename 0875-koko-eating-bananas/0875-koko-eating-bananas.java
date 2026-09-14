class Solution {
    public int minEatingSpeed(int []piles, int h){
        int start = 1;
        int end = max(piles);
        while(start < end){
            int mid = start + (end - start)/2;
            if(canEatBanana(piles, h, mid)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean canEatBanana(int[] piles, int h, int mid) {

        int hr = 0;
        for(int pile : piles){
            hr += pile/mid;
            if(pile % mid > 0) hr++;
        }
        return hr <= h;

    }

    static int max(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i] > max) max = piles[i];
        }
        return max;
    }
}