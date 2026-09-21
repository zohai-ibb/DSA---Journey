class Solution {
    public String convert(String str, int row) {
        StringBuilder s = new StringBuilder();
        StringBuilder ans[] = new StringBuilder[row];

        for (int i = 0; i < row; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0;

        while (i < str.length()) {

            // Going down
            for (int j = 0; j < ans.length && i < str.length(); j++) {
                ans[j].append(str.charAt(i));
                i++;
            }

            // Going up
            for (int j = row - 2; j > 0 && i < str.length(); j--) {
                ans[j].append(str.charAt(i));
                i++;
            }
        }

        // Combine all rows
        for (int j = 0; j < ans.length; j++) {
            s.append(ans[j]);
        }

        return s.toString();
    }
}