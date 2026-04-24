class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;

        for (int num : apple) {
            totalApples += num;
        }

        Arrays.sort(capacity);

        int minimumBoxes = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            totalApples -= capacity[i];
            if (totalApples <= 0) {
                minimumBoxes = capacity.length - i;
                break;
            }
        }

        return minimumBoxes;
    }
}