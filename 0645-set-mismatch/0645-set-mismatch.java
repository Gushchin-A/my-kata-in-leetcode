class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = Math.abs(nums[i]);
            int currentIndex = digit - 1;
            if (nums[currentIndex] > 0) {
                nums[currentIndex] *= -1;
            } else {
                duplicate = digit;
            }
        }

        int missing = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        int mismatch = 2;
        int[] result = new int[mismatch];
        result[0] = duplicate;
        result[1] = missing;

        return result;
    }
}
