class Solution {
    public int minimumCost(int[] nums) {
        int[] minNumsTrimmed = Arrays.copyOfRange(nums, 1, nums.length);
        Arrays.sort(minNumsTrimmed);

        return nums[0] + minNumsTrimmed[0] + minNumsTrimmed[1];
    }
}
