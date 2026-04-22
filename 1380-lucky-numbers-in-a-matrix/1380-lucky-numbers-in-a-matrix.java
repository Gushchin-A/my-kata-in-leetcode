class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] indices = new int[100_001];
        int[] minElements = new int[rows];

        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            int indexMin = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    indexMin = j;
                }
            }
            minElements[i] = min;
            indices[min] = indexMin;
        }

        int[] tempLuckyNumbers = new int[rows];
        int index = 0;
        for (int i = 0; i < minElements.length; i++) {
            int max = minElements[i];
            boolean isLucky = true;
            for (int j = 0; j < rows; j++) {
                if (matrix[j][indices[minElements[i]]] > max) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                tempLuckyNumbers[index++] = max;
            }
        }

        int[] luckyNumbers = Arrays.copyOfRange(tempLuckyNumbers, 0, index);

        List<Integer> result = new ArrayList<>();
        for (int num : luckyNumbers) {
            result.add(num);
        }

        return result;
    }
}