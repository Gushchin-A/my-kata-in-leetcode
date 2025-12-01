class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index += 2;
            }
        }

        index = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index += 2;
            }
        }

        return result;
    }
}