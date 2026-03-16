class Solution {
    public int differenceOfSums(int n, int m) {
        int sumNotDivisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                sumNotDivisible += i;
            }
        }

        int sumDivisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisible += i;
            }
        }

        return sumNotDivisible - sumDivisible;
    }
}