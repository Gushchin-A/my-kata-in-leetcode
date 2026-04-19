class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int layers = n / 2;

        for (int layer = 0; layer < layers; layer++) {

            int last = n - 1 - layer;
            int offsets = last - layer;

            for (int offset = 0; offset < offsets; offset++) {
                int up = matrix[layer][layer + offset];
                int right = matrix[layer + offset][last];
                int down = matrix[last][last - offset];
                int left = matrix[last - offset][layer];

                matrix[layer][layer + offset] = left;
                matrix[layer + offset][last] = up;
                matrix[last][last - offset] = right;
                matrix[last - offset][layer] = down;
            }
        }
    }
}