class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0]; //First Element 
        String s2 = str[str.length - 1]; //Last Element

        String prefix = "";

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if(s1.charAt(i) == s2.charAt(i)){
                prefix += s1.charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }
}