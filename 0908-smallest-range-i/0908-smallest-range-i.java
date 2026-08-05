class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);

        int first = nums[0] + k;
        int last = nums[nums.length - 1] - k;

        return Math.max(0, last - first);
    }
}
