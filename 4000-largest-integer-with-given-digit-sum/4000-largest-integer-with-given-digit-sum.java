class Solution {
    public int largestInteger(int n, int s) {
        if (s > n * 9) {
            return -1;
        }

        int result = 0;
        int remain = s;
        while (n > 0) {
            int digit = Math.min(9, remain);
            result = result * 10 + digit;
            remain -= digit;
            n--;
        }

        return result;
    }
}