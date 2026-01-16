class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // 1. Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Result list
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        // 3. Merge logic
        for (int i = 1; i < intervals.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] curr = intervals[i];

            if (last[1] >= curr[0]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                merged.add(curr);
            }
        }

        // 4. Convert to array
        return merged.toArray(new int[merged.size()][2]);
    }
}
public class MergeIntervals{
    public static void main(String[] args){
        //
    }
}