class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] rightSum = new int[n];
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }
                
        int[] leftSum = new int[n];
        sum = 0;
        for (int i = 0; i < n; i++) {
            leftSum[i] = sum;
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
            sum += nums[i];
        }

        return -1;
    }
}