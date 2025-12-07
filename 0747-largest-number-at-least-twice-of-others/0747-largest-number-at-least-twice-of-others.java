class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;

        int max = nums[0];
        int indexMax = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }
        }

        int secondMax = max == nums[0] ? nums[1] : nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] != max && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max / 2 >= secondMax ? indexMax : -1;
    }
}