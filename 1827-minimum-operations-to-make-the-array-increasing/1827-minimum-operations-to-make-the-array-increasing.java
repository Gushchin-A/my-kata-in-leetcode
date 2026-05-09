class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        int tempMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= tempMax) {
                tempMax++;
                operations += tempMax - nums[i];
            } else {
                tempMax = nums[i];
            }
        }

        return operations;
    }
}