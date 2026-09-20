class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    static boolean checkPalindrome(String s, int start, int end) {

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    static boolean check(String a, String b) {

        int i = 0;
        int j = b.length() - 1;

        // Compare a from left with b from right
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }

        // Remaining part can come from either string
        return checkPalindrome(a, i, j) ||
                checkPalindrome(b, i, j);
    }
}