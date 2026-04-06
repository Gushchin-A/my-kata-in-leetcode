class Solution {
    public int countDigits(int num) {
        int result = 0;
        int numCopy = num;

        while (numCopy > 0) {
            int digit = numCopy % 10;
            if (num % digit == 0) {
                result++;
            }
            numCopy /= 10;
        }

        return result;
    }
}