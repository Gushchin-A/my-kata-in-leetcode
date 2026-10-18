class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int baseNum = nums[nums.length - 1];

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