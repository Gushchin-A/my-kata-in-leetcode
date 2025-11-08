class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum += nums[i];
        }

        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = Math.abs(result[i] - sum);
            sum += nums[i]; 
        }

        return result;
    }
}