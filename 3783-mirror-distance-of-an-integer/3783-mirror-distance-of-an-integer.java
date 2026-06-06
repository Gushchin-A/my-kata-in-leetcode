class Solution {
    public int mirrorDistance(int n) {
        int nReverse = 0;
        int nCopy = n;

        while (nCopy > 0) {
            int digit = nCopy % 10;
            nReverse = nReverse * 10 + digit;
            nCopy /= 10;
        }

        return Math.abs(n - nReverse);
    }
}