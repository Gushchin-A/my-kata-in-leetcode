class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;

        int alternatingSum = 0;
        for (int even = 0; even < n; even += 2) {
            alternatingSum += nums[even];
        }

        for (int odd = 1; odd < n; odd += 2) {
            alternatingSum -= nums[odd];
        }

        return alternatingSum;
    }
}