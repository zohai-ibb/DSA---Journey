class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

    int n = intervals.length;

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    int i = 0;

    while (i < n) {
        int start = intervals[i][0];
        int end = intervals[i][1];

        int j = i + 1;

        while (j < n && intervals[j][0] <= end) {
            end = Math.max(intervals[j][1], end);
            j++;
        }

        res.add(new int[]{start, end});
        i = j;
    }

    return res.toArray(new int[res.size()][]);
    }
}