class Solution {
    public boolean isHappy(int n) {
        int number = n;
        int result = 0;

        while (number != 1) {
            while (number > 0) {
                int digit = number % 10;
                result += digit * digit;
                number /= 10;
            }
            number = result;
            int infiniteLoop = 4;

            if (result == infiniteLoop) {
                return false;
            }

            result = 0;
        }

        return true;
    }
}
