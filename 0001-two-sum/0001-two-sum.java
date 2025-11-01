class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> allNums = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (allNums.containsKey(need)) {
                result[0] = allNums.get(need);
                result[1] = i;
                break;
            } else {
                allNums.put(nums[i], i);
            }
        }

        return result;
    }
}