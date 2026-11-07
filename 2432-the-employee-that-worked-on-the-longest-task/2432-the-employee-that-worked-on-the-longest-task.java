class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxTime = logs[0][1];

        for (int i = 1; i < logs.length; i++) {
            int candidateTime = logs[i][1] - logs[i - 1][1];
            if (candidateTime > maxTime) {
                maxTime = candidateTime;
            }
        }

        List<Integer> listId = new ArrayList<>();

        if (logs[0][1] >= maxTime) {
            listId.add(logs[0][0]);
        }

        for (int i = 1; i < logs.length; i++) {
            if (logs[i][1] - logs[i - 1][1] == maxTime) {
                listId.add(logs[i][0]);
            }
        }

        return Collections.min(listId);
    }
}