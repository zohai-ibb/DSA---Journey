class Solution {
    public int numWays(String s) {

        long MOD = 1000000007;

        int ones = 0;

        // Count total ones
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        // Cannot divide ones equally into 3 parts
        if (ones % 3 != 0) {
            return 0;
        }

        // If there are no ones
        if (ones == 0) {
            long n = s.length();
            return (int)(((n - 1) * (n - 2) / 2) % MOD);
        }

        int each = ones / 3;

        int count = 0;
        long first = 0;
        long second = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                count++;
            }

            // After first group of ones
            if (count == each) {
                first++;
            }

            // After second group of ones
            if (count == 2 * each) {
                second++;
            }
        }

        return (int)((first * second) % MOD);
    }
}