class Solution {
    public boolean isPalindrome(String str) {
        String newStr = str.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        return helper(newStr, 0, newStr.length());
    }

    static boolean helper(String str, int i, int length) {
        if(i >= length) return true;
        if(str.charAt(i) != str.charAt(length - 1)) return false;
        return helper(str, i + 1, length - 1);
    }
}