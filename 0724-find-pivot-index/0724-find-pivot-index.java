class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] rightSum = new int[n];
        int last = n - 1;
        int sum = 0;
        rightSum[last] = sum;
        for (int i = last - 1; i >= 0; i--) {
            sum += nums[i + 1];
            rightSum[i] = sum;
        }
                
        int[] leftSum = new int[n];
        sum = 0;
        leftSum[0] = sum;
        for (int i = 1; i < n; i++) {
            sum += nums[i - 1];
            leftSum[i] = sum;
            if (leftSum[i - 1] == rightSum[i - 1]) {
                return i - 1;
            }
        }

        return leftSum[last] == rightSum[last] ? last : -1;
    }
}