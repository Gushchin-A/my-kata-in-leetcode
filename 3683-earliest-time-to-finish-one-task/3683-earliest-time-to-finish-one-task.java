class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime = tasks[0][0] + tasks[0][1];

        for (int i = 0; i < tasks.length; i++) {
            int currentTime = tasks[i][0] + tasks[i][1];
            minTime = Math.min(minTime, currentTime);
        }

        return minTime;
    }
}