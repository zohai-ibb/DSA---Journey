class Solution {
    public boolean rotateString(String s, String g) {

        if (s.length() != g.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(0) == g.charAt(i)) {

                boolean check = true;

                for (int j = 0; j < s.length(); j++) {

                    if (s.charAt(j) != g.charAt((i + j) % g.length())) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    return true;
                }
            }
        }

        return false;
    }
}