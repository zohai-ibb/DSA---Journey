public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // An empty needle is always found at index 0
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1; // Needle not found in haystack
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        int index = solution.strStr(haystack, needle);
        System.out.println(index); // Output: 2 (the substring "ll" starts at index 2 in "hello")
    }
}