class Solution {
    public int[] runningSum(int[] nums) {
        int prefixSum = 0;
        int [] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            result[i] = prefixSum;
        }

        return result;
    }
}