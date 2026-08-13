class Solution {
    public int reverse(int num) {
        int newNum = 0, digit = 0;
        while(num != 0){
            digit = num % 10;
            if (newNum > Integer.MAX_VALUE / 10 ||
                    (newNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (newNum < Integer.MIN_VALUE / 10 ||
                    (newNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;

            }
                newNum = (newNum * 10) + digit;
                num /= 10;
            }
            return newNum;   
    }
}