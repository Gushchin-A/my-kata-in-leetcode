class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];

        int alice = 0;
        int bob = 1;
        while (alice < nums.length) {
            result[alice] = nums[bob];
            result[bob] = nums[alice];
            alice += 2;
            bob += 2;
        }

        return result;
    }
}