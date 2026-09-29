class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDigitRange = 0;

        for (int num : nums) {
            int digitRange = getDigitRange(num);
            maxDigitRange = Math.max(digitRange, maxDigitRange);
        }

        int result = 0;
        for (int num : nums) {
            int digitRange = getDigitRange(num);
            if (digitRange == maxDigitRange) {
                result += num;
            }
        }

        return result;
    }

    private int getDigitRange(int num) {
        int[] sort = new int[(int) Math.log10(num) + 1];

        int indexRes = 0;
        while (num > 0) {
            sort[indexRes++] = num % 10;
            num /= 10;
        }

        Arrays.sort(sort);

        return sort[sort.length - 1] - sort[0];
    }
}
