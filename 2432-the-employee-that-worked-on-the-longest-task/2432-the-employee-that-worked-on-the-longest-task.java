class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int idEmployee = logs[0][0];
        int maxTime = logs[0][1];

        for (int i = 1; i < logs.length; i++) {
            int candidateTime = logs[i][1] - logs[i - 1][1];
            if (candidateTime > maxTime) {
                maxTime = candidateTime;
                idEmployee = logs[i][0];
            } else if (candidateTime == maxTime) {
                idEmployee = Math.min(idEmployee, logs[i][0]);
            }
        }

        return idEmployee;
    }
}
