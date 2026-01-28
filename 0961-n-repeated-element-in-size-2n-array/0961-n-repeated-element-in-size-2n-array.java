class Solution {
    public int repeatedNTimes(int[] nums) {
        int maxNum = 10_000;
        int[] counts = new int[maxNum + 1];

        for (int num : nums) {
            counts[num] += 1;
            if (counts[num] > 1) {
                return num;
            }
        }

        return -1;
    }
}