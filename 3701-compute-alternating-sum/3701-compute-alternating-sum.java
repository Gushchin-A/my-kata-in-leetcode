class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;

        int alternatingSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alternatingSum += nums[i];
            } else {
                alternatingSum -= nums[i];
            }
        }

        return alternatingSum;
    }
}