class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int result = 0;
        for (int[] box : boxTypes) {
            if (truckSize == 0) {
                break;
            }
            int canTake = Math.min(box[0], truckSize);
            result += canTake * box[1];
            truckSize -= canTake;
        }

        return result;
    }
}