class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        double sumSubarray = 0.0;

        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                sumSubarray += nums[i];
                if (i == k - 1) {
                    max = sumSubarray / k;
                }
            }

            if (i > k - 1) {
                sumSubarray = sumSubarray - nums[i - k] + nums[i];
                max = Math.max(max, sumSubarray / k);
            }
        }

        return max;
    }
}