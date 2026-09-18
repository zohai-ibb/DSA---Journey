class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String str = "";
        int j = s.length();
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                continue;
            }
            str = str + s.substring(i + 1, j) + " ";
            j = i;
        }
        str = str + s.substring(0, j);
        return str;
    }
}