class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sumSubarray = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                sumSubarray += nums[i];
                if (i == k - 1) {
                    maxSum = sumSubarray;
                }
            }

            if (i > k - 1) {
                sumSubarray = sumSubarray - nums[i - k] + nums[i];
                maxSum = Math.max(maxSum, sumSubarray);
            }
        }

        return (double) maxSum / k;
    }
}
