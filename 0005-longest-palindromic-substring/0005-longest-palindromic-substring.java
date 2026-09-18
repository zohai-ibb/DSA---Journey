class Solution {
    public String longestPalindrome(String s) {

        int len = 0;
        String str = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if (isPalindrome(sub)) {

                    if (len < sub.length()) {
                        len = sub.length();
                        str = sub;
                    }
                }
            }
        }

        return str;
        
    }
    static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}