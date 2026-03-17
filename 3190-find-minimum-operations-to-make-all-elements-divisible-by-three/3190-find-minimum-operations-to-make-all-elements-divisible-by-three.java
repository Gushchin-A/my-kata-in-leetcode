class Solution {
    public int minimumOperations(int[] nums) {
        int totalOperations = 0;
        int k = 3;

        for(int num : nums) {
            int stepDown = num % k;
            int stepUp = k - stepDown;
            totalOperations += Math.min(stepDown, stepUp);
        }

        return totalOperations;
    }
}