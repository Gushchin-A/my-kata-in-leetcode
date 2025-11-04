class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int half = n / 2;

        Arrays.sort(nums);

        return nums[half];
    }
}