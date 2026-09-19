class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int max = maxFreq(freq);
                int min = minFreq(freq);
                sum += max - min;
            }
        }
        return sum;
    }

    private static int minFreq(int[] freq) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] < min && freq[i] != 0)
                min = freq[i];
        }
        return min;
    }

    static int maxFreq(int[] freq) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > max) max = freq[i];
        }
        return max;
    }
}