class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int max = grid.length * grid.length;
        boolean[] seen = new boolean[max + 1];


        int[] result = new int[2];

        for (int[] row : grid) {
            for (int element : row) {
                if (seen[element]) {
                    result[0] = element;
                }
                seen[element] = true;
            }
        }

        for (int i = 1; i <= max; i++) {
            if (!seen[i]) {
                result[1] = i;
            }
        }

        return result;
    }
}