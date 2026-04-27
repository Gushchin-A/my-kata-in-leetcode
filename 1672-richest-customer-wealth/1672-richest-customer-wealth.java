class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        
        for (int[] row : accounts) {
            int tempWealth = 0;
            for (int value : row) {
                tempWealth += value;
            }
            maximumWealth = Math.max(maximumWealth, tempWealth);
        }

        return maximumWealth;
    }
}