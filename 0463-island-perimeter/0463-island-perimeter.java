class Solution {
    public int islandPerimeter(int[][] grid) {
        int rowsLength = grid.length;
        int colsLength = grid[0].length;

        int result = 0;
        for (int i = 0; i < rowsLength; i++) {
            result += grid[i][0] == 1 ? 2 : 0;
            for (int j = 1; j < colsLength; j++) {
                if (grid[i][j] == 1) {
                    if (grid[i][j - 1] != 1) {
                        result += 2;
                    }
                }
            }
        }

        for (int j = 0; j < colsLength; j++) {
            result += grid[0][j] == 1 ? 2 : 0;
            for (int i = 1; i < rowsLength; i++) {
                if (grid[i][j] == 1) {
                    if (grid[i - 1][j] != 1) {
                        result += 2;
                    }
                }
            }
        }

        return result;
    }
}