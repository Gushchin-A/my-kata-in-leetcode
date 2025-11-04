class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;
        String temp;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            temp = left < right
                    ? "" + nums[left] + nums[right]
                    : "" + nums[left];

            int digitFromStr = getDigitFromString(temp);
            result += digitFromStr;
            left++;
            right--;
        }

        return result;
    }

    private static int getDigitFromString(String str) {
        int digitFromStr = 0;
        if (str.length() == 1) {
            digitFromStr = (str.charAt(0) - '0');
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (i == 0) {
                digitFromStr = (str.charAt(i) - '0') * 10
                        + (str.charAt(i + 1) - '0');
            }
            if (i > 0) {
                digitFromStr = digitFromStr * 10
                        + (str.charAt(i + 1) - '0');
            }
        }
        return digitFromStr;
    }
}