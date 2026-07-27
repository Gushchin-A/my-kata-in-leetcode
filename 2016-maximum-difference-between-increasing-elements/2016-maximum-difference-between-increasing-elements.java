class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);

            if (min < nums[i]) {
                result = Math.max(result, nums[i] - min);
            }
        }

        return result;
    }
}
