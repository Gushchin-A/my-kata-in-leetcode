class Solution {
    public int minOperations(int[] nums, int k) {
        int minimumOperations = 0;
        for (int num : nums) {
            if (num < k) {
                minimumOperations++;
            }
        }

        return minimumOperations;
    }
}