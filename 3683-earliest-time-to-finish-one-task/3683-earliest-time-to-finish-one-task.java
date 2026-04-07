class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime = tasks[0][0] + tasks[0][1];

        for (int i = 0; i < tasks.length; i++) {
            int currentTime = 0;
            for (int j = 0; j < tasks[i].length; j++) {
                currentTime += tasks[i][j];
            }
            minTime = Math.min(minTime, currentTime);
        }

        return minTime;
    }
}