class Solution {
    public int maxDepth(String s) {
        int len = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                count++;
                if(len < count) len = count;
            } else if(s.charAt(i) == ')'){
                count--;
            } else {
                continue;
            }
        }
        return len;
    }
}