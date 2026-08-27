class Solution {
    public boolean isPerfectSquare(int num) {
        int length = getHalfDigit(num);

        for (int i = 1; i <= length; i++) {
            if (i * i == num) {
                return true;
            }
        }

        return false;
    }

    private int getHalfDigit(int num) {
        int originalNum = num;
        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }

        int divideСount = digits % 2 == 0 ? digits / 2 - 1 : digits / 2;

        for (int i = 0; i < divideСount; i++) {
            originalNum /= 10;
        }

        return originalNum;
    }
}
