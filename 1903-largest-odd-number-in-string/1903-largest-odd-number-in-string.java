class Solution {
    public String largestOddNumber(String str) {
        while(str.length() > 0){
            int num = str.charAt(str.length() - 1) - '0';
            if(num % 2 == 1) return str;
            else str = str.substring(0, str.length() - 1);
        }
        return "";
    }
}