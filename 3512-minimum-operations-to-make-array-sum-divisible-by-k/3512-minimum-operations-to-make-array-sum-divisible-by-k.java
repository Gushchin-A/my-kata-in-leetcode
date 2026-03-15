class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = sumArray(nums);
        return sum % k;
    }

    private static int sumArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}