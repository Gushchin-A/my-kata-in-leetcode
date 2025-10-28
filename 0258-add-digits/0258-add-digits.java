class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int tempResult = 0;
        while (num >= 10) {
            tempResult = 0;
            while (num != 0) {
                int digit = num % 10;
                tempResult += digit;
                num = num / 10;
            }
            num = tempResult;
        }

        return num;
    }
}