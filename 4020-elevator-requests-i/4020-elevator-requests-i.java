class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalTime = 0;

        totalTime += requests[0];
        for (int i = 0; i < requests.length - 1; i++) {
            totalTime += Math.abs(requests[i] - requests[i + 1]); 
        }

        return totalTime;
    }
}
