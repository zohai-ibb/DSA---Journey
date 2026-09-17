class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String start = str[0];
        String end = str[str.length - 1];
        String prefix = "";
        for (int i = 0; i < Math.min(start.length(), end.length()); i++) {
            if(start.charAt(i) == end.charAt(i)){
                prefix = prefix + end.charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }
}