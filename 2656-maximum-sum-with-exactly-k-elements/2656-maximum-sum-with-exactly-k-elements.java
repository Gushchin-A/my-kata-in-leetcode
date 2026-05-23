class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += max;
            max += 1;
        }

        return maxSum;
    }
}