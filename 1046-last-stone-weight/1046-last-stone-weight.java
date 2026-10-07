class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        if (n == 1) {
            return stones[0];
        }

        Arrays.sort(stones);

        while (stones[n - 1] > 0 && stones[n - 2] > 0) {
            int x = stones[n - 2];
            int y = stones[n - 1];
            stones[n - 2] = 0;
            stones[n - 1] = y - x;

            Arrays.sort(stones);
        }

        return stones[n - 1];
    }
}