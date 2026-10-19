class Solution {
    public int findChampion(int[][] grid) {
        int champion = 0;
        int maxVictories = 0;

        for (int i = 0; i < grid.length; i++) {
            int victories = 0;
            for (int j = 0; j < grid[i].length; j++) {
                victories += grid[i][j];
            }
            if (victories > maxVictories) {
                maxVictories = victories;
                champion = i;
            }
        }

        return champion;
    }
}
