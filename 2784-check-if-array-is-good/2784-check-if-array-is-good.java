class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int baseNum = max;
        if (baseNum >= nums.length) {
            return false;
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            int current = freq.merge(num, 1, Integer::sum);
            if (num != baseNum && current > 1) {
                return false;
            }
        }

        return freq.get(baseNum) == 2;
    }
}