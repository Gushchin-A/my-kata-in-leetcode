class Solution {
    public int digitFrequencyScore(int n) {
        int[] counts = new int[10];

        while (n > 0) {
            counts[n % 10]++;
            n /= 10;
        }

        int result = 0;
        for (int i = 0; i < counts.length; i++) {
            result += i * counts[i];
        }

        return result;
    }
}