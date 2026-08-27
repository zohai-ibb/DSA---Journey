class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

    Arrays.sort(
        intervals,
        (a, b) -> Integer.compare(a[0], b[0])
    );

    for (int[] interval : intervals) {

        // If result is empty or there is no overlap
        if (res.isEmpty() || res.get(res.size() - 1)[1] < interval[0]) {

            res.add(new int[]{interval[0], interval[1]});

        } else {

            // Merge with the previous interval
            int lastIndex = res.size() - 1;

            int maxEnd = Math.max(
                res.get(lastIndex)[1],
                interval[1]
            );

            res.get(lastIndex)[1] = maxEnd;
        }
    }

    return res.toArray(new int[res.size()][]);
    }
}