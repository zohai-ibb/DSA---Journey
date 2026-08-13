class Solution {
    public int reverse(int num) {
        long newNum = 0;

        while(num != 0){
            newNum = (newNum * 10) + (num % 10);
            num /= 10;
        }

        if(newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE){
            return 0;
        }

        return (int) newNum;
    }
}