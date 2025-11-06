class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;

        int resLength = 0;
        for (int i = 0; i < n; i += 2) {
            resLength += nums[i];
        }

        int[] result = new int[resLength];
        int resIndex = 0;
        for (int i = 0; i < n; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                result[resIndex++] = val;
            }
        }

        return result;
    }
}