class Solution {
    public int minOperations(int[] nums) {
        int[] copyNums = Arrays.copyOf(nums, nums.length);

        int operations = 0;
        int tempMax = 0;
        for (int i = 0; i < copyNums.length - 1; i++) {
            if (copyNums[i] >= copyNums[i + 1]) {
                tempMax = copyNums[i] + 1;
                operations += tempMax - copyNums[i + 1];
                copyNums[i + 1] = tempMax;
            }
        }

        return operations;
    }
}