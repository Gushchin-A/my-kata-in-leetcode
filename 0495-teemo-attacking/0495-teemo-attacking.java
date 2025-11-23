class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;

        int total = duration;
        for (int i = 1; i < n; i++) {
            int current = timeSeries[i];
            int prev = timeSeries[i - 1];
            int gap = current - prev;

            total += gap >= duration ? duration : gap;
        }

        return total;
    }
}