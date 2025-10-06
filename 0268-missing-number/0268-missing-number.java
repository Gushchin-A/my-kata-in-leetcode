class Solution {
    public int missingNumber(int[] nums) {
        int[] fullNums = new int[nums.length + 1];
        int n = fullNums.length;

        for (int i = 0; i < n; i++) {
            fullNums[i] = i;
        }

        Arrays.sort(nums);
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i == nums.length - 1 && nums[i] == fullNums[i]) {
                result = i + 1;
                break;
            }
            if (nums[i] != fullNums[i]) {
                result = i;
                break;
            }
        }

        return result;
    }
}