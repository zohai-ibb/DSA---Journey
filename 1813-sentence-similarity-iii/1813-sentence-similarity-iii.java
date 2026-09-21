class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {

        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        // Make a the shorter sentence
        if (a.length > b.length) {
            String[] temp = a;
            a = b;
            b = temp;
        }

        int i = 0;
        int j = 0;

        // Match from beginning
        while (i < a.length && a[i].equals(b[i])) {
            i++;
        }

        // Match from end
        while (j < a.length - i &&
                a[a.length - 1 - j].equals(b[b.length - 1 - j])) {
            j++;
        }

        return i + j == a.length;
    }
}