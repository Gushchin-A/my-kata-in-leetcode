class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;

        int alternatingSum = 0;
        int even = 0;
        int odd = 1;
        while (even < n && odd < n) {
            alternatingSum += nums[even] - nums[odd];
            even += 2;
            odd += 2;
        }

        if (n % 2 != 0) {
            alternatingSum += nums[n - 1];
        }

        return alternatingSum;
    }
}