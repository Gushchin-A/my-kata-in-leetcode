class Solution {
    public int subarraySum(int[] nums) {
        int[] prefixSum = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }

        int totalSum = prefixSum[0];
        for (int i = 1; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            
            if (start == 0) {
                totalSum += prefixSum[i];
            } else {
                totalSum += prefixSum[i] - prefixSum[start - 1];
            }
        }

        return totalSum;
    }
}