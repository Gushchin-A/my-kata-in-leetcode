class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int totalLength = rows * cols;

        int[] flattenGrid = flatten(grid);
        int[] flattenSwapIndex = new int[totalLength];
        for (int i = 0; i < totalLength; i++) {
            k = k % totalLength;
            int newIndex = (i + k) % totalLength;
            flattenSwapIndex[newIndex] = flattenGrid[i];
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        int countCols = 0;
        for (int i = 0; i < totalLength; i++) {
            row.add(flattenSwapIndex[i]);
            countCols++;
            if (countCols == cols) {
                result.add(row);
                row = new ArrayList<>();
                countCols = 0;
            }
        }

        return result;
    }
    
    public static int[] flatten(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] flatten = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatten[index++] = grid[i][j];
            }
        }

        return flatten;
    }
}