class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle = nums[nums.length / 2];

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l++] == middle) {
                return false;
            }

            if (nums[r--] == middle) {
                return false;
            }
        }

        return true;
    }
}