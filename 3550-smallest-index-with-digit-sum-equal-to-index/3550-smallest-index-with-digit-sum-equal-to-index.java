class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i == getSumDigits(nums[i])) {
                min = Math.min(i, min);
            }
        }

        return min != Integer.MAX_VALUE ? min : -1;
    }

    private int getSumDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
