class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int noValidBox = -1;
        boolean hasValidBox = false;

        int smallestIndex = 0; 
        int minBoxSize = Integer.MAX_VALUE;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                hasValidBox = true;
                if (capacity[i] < minBoxSize) {
                    smallestIndex = i;
                    minBoxSize = capacity[i];
                }
            }
        }

        return hasValidBox == true ? smallestIndex : noValidBox;
    }
}