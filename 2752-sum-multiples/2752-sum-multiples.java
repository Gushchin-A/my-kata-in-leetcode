class Solution {
    public int sumOfMultiples(int n) {
        final int startPosition = 3;
        int sum = 0;

        for (int i = startPosition; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            } else if (i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}