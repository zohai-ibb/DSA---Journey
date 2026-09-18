class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");

        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

        Collections.reverse(list);

        return String.join(" ", list);
    }
}