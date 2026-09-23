class Solution {
    public String multiply(String s1, String s2) {
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int[] ans = new int[s1.length() + s2.length()];

        for (int i = s1.length() - 1; i >= 0; i--) {

            for (int j = s2.length() - 1; j >= 0; j--) {

                int d1 = s1.charAt(i) - '0';
                int d2 = s2.charAt(j) - '0';

                int mul = d1 * d2;

                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = mul + ans[pos2];

                ans[pos2] = sum % 10;
                ans[pos1] += sum / 10;
            }
        }

        StringBuilder str = new StringBuilder();

        int i = 0;

        while (i < ans.length && ans[i] == 0) {
            i++;
        }

        while (i < ans.length) {
            str.append(ans[i]);
            i++;
        }

        return str.toString();
    }
}