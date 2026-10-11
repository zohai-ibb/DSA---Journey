class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1] += 1;
        for (int i = n - 1; i > 0 && digits[i] == 10; i--) {
            digits[i] = 0;
            digits[i - 1] += 1;
        }
        
        if (digits[0] == 10) {
            digits[0] = 0;
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, n);
            return newDigits;
        } else {
            return digits;
        }
    }
}
