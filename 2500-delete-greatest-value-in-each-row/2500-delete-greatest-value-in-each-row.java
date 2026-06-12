class Solution {
    public int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> rowsWithMax = new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < row.length; j++) {
                currentRow.add(row[j]);
            }
            currentRow.sort(Collections.reverseOrder());
            rowsWithMax.add(currentRow);
        }

        int finalAnswer = 0;
        for (int i = 0; i < grid[0].length; i++) {
            List<Integer> deleteValues = new ArrayList<>();
            for (List<Integer> currentRow : rowsWithMax) {
                deleteValues.add(currentRow.get(i));
            }
            Collections.sort(deleteValues);
            finalAnswer += deleteValues.getLast();
        }

        return finalAnswer;
    }
}