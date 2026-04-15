class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int left = mat[i][j];
                int right = mat[i][n - 1 - j];
                sum += left + right;
                break;
            }
        }

        if (n % 2 != 0) {
            int intersection = n / 2;
            sum -= mat[intersection][intersection];
        }

        return sum;
    }
}