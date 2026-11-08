class Solution {
    public int maxOperations(int[] nums) {
        int target = nums[0] + nums[1];
        int result = 1;

        for (int i = 2; i < nums.length - 1; i += 2) {
            if (nums[i] + nums[i + 1] == target) {
                result++;
            } else {
                break;
            }
        }

        return result;
    }
}