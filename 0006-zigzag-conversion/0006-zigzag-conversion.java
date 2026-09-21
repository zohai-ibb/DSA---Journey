class Solution {
    public String convert(String str, int row) {
        String s = "";
        String ans[] = new String[row];

        for (int i = 0; i < row; i++) {
            ans[i] = "";
        }

        int i = 0;
        while(i < str.length()){

            for (int j = 0; j < ans.length && i < str.length(); j++) {
                ans[j]  += str.charAt(i) + "";
                i++;
            }

            for (int j = row - 2; j > 0 && i < str.length(); j--) {
                ans[j] += str.charAt(i);
                i++;
            }

        }

        for (int j = 0; j < ans.length; j++) {
            s += ans[j];
        }

        return s;
    }
}