class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int maxSneakyNumbers = 2;
        int[] result = new int[maxSneakyNumbers];
        Arrays.sort(nums);

        int indexRes = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result[indexRes++] = nums[i];
            }
        }

        return result;
    }
}