class Solution {
    public boolean checkPerfectNumber(int num) {
        int sumDivisors = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumDivisors += i;
            }
        }

        return num == sumDivisors;
    }
}
