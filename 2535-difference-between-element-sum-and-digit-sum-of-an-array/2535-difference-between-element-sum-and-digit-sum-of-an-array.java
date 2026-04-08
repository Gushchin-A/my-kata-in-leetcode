class Solution {
    public int differenceOfSum(int[] nums) {
        int sumElement = 0;
        int sumDigit = 0;

        for (int num : nums) {
            sumElement += num;
            if (num > 9) {
                sumDigit += findSumDigitOfNumber(num);
            } else {
                sumDigit += num;
            }
        }

        return Math.abs(sumElement - sumDigit);
    }

    private int findSumDigitOfNumber(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        
        return result;
    }
}