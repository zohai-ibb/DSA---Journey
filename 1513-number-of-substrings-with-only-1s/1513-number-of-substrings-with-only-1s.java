class Solution {
    public int numSub(String str) {
        int i = 0;
        long count = 0;
        long MOD = 1000000007;

        while (i < str.length()) {

            if (str.charAt(i) == '1') {

                int j = i;

                while (j + 1 < str.length() && str.charAt(j + 1) == '1') {
                    j++;
                }

                long n = j - i + 1;

                count = (count + (n * (n + 1)) / 2) % MOD;

                i = j + 1;

            } else {
                i++;
            }
        }

        return (int) count;
    }
}