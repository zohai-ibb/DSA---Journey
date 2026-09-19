class Solution {
    public String largestOddNumber(String str) {
        int i = str.length() - 1;

        while(i >= 0){
            int digit = str.charAt(i);
            if(digit % 2 == 0){
                i--;
            } else {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }
}