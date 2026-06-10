class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int result = -1; 
        int minBoxSize = Integer.MAX_VALUE;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                if (capacity[i] < minBoxSize) {
                    result = i;
                    minBoxSize = capacity[i];
                }
            }
        }

        return result;
    }
}