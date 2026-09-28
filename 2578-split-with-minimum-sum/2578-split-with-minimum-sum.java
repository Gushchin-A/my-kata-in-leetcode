class Solution {
    public int splitNum(int num) {
        int[] nums = new int[(int) Math.log10(num) + 1];

        int indexRes = 0;
        while (num > 0) {
            nums[indexRes++] = num % 10;
            num /= 10;
        }

        Arrays.sort(nums);

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + nums[i];
            } else {
                num2 = num2 * 10 + nums[i];
            }
        }

        return num1 + num2;
    }
}
