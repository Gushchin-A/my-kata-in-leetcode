class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

        int result = 0;
        for (int value : freq.values()) {
            if (value == maxFreq) {
                result += value;
            }
        }

        return result;
    }
}