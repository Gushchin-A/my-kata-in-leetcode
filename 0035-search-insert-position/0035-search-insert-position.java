class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] == target || nums[0] > target) {
            return 0;
        }

        if (nums.length == 1 && nums[0] < target) {
            return 1;
        }

        int position = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1 && nums[i] != target && nums[i] > target) {
                position = i;
                return position;
            } else if (i == nums.length - 1 && nums[i] != target && nums[i] < target) {
                position = i + 1;
                return position;
            }

            if (target == nums[i]) {
                position = i;
                return position;
            } else {
                if (target > nums[i - 1] && target < nums[i]) {
                    position = i;
                    break;
                }
            }
        }

        return position;
    }
}