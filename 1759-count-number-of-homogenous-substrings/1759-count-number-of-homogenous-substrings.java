class Solution {
    public int countHomogenous(String str) {
        long count = 0;
        int MOD = 1000000007;

        int i = 0, j = 0;

        while (i < str.length()) {

            j = i;

            while (j < str.length() - 1 &&
                    str.charAt(j) == str.charAt(j + 1)) {
                j++;
            }

            long len = j - i + 1;

            // Number of substrings = len * (len + 1) / 2
            long ways = (len * (len + 1) / 2) % MOD;

            count = (count + ways) % MOD;

            i = j + 1;
        }

        return (int) count;
    }
}