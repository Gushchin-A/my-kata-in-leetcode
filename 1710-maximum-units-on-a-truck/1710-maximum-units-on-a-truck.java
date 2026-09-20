class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int result = 0;
        int boxNumber = 0;
        while (truckSize != 0 && boxNumber < boxTypes.length) {
            if (boxTypes[boxNumber][0] == 0) {
                boxNumber++;
            }
            if (boxNumber < boxTypes.length) {
                result += boxTypes[boxNumber][1];
                truckSize--;
                boxTypes[boxNumber][0]--;
            }
        }

        return result;
    }
}