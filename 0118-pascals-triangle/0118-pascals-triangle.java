class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];

            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < triangle.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < triangle[i].length; j++) {
                row.add(triangle[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}
