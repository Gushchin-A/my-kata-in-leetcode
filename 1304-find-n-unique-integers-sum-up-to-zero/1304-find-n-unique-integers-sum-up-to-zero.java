class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                result[i] = i + 1;
                result[i + 1] = -(i + 1);
            }
        } else {
            for (int i = 0; i < n - 1; i += 2) {
                result[i] = i + 1;
                result[i + 1] = -(i + 1);
            }
        }

        return result;
    }
}