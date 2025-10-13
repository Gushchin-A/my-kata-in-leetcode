class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] copyNums = Arrays.copyOf(nums, nums.length);

        int duplicate = 0;
        for (int i = 0; i < copyNums.length; i++) {
            int digit = Math.abs(copyNums[i]);
            int currentIndex = digit - 1;
            if (copyNums[currentIndex] > 0) {
                copyNums[currentIndex] *= -1;
            } else {
                duplicate = digit;
            }
        }

        int missing = 0;
        for (int i = 0; i < copyNums.length; i++) {
            if (copyNums[i] > 0) {
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
