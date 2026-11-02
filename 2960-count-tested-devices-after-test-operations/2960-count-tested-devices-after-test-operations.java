class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int n = batteryPercentages.length;
        int tested = 0;

        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0) {
                tested++;
                for (int j = i + 1; j < n; j++) {
                    int percent = batteryPercentages[j] - 1;
                    batteryPercentages[j] = percent >= 0 ? percent : 0;
                }
            }

        }

        return tested++;
    }
}
