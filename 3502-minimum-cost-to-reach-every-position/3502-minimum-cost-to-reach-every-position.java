class Solution {
    public int[] minCosts(int[] cost) {
        int min = Integer.MAX_VALUE;
        int[] answer = new int[cost.length];

        for (int i = 0; i < answer.length; i++) {
            min = Math.min(min, cost[i]);
            answer[i] = min;
        }

        return answer;
    }
}
