class Solution {
    public boolean isPalindrome(int num) {
        if( num < 0)
            return false;
        if(num == reverse(num))
            return true;
        return false;
    }
    static int reverse(int num){
        int newNum = 0, digit = 0;
        while(num > 0){
            digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;
    }

}