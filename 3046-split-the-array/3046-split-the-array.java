class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.merge(n, 1, Integer::sum);
        }

        for (int value : freq.values()) {
            if (value > 2) {
                return false;
            }
        }

        return true;
    }
}
