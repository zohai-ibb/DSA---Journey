class Solution {
    public int romanToInt(String s) {
        int i = 1;
        int finalNum = 0;
        while (i < s.length()) {
            int num1 = helper(s.charAt(i - 1));
            int num2 = helper(s.charAt(i));
            if (num1 >= num2) {
                finalNum += num1;
                i++;
            } else {
                finalNum += num2 - num1;
                i = i + 2;
            }
        }
        if (i == s.length()) {
            finalNum += helper(s.charAt(i - 1));
        }
        return finalNum;
    }

    static int helper(char ch) {
        if (ch == 'M')
            return 1000;
        if (ch == 'D')
            return 500;
        if (ch == 'C')
            return 100;
        if (ch == 'L')
            return 50;
        if (ch == 'X')
            return 10;
        if (ch == 'V')
            return 5;
        return 1;
    }
}