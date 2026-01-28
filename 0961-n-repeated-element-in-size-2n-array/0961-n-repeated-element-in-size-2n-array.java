class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        int result = -1;
        int targetCount = nums.length / 2;
        for (int num : nums) {
            counts.merge(num, 1, (oldCount, newCount) -> oldCount + newCount);
            if (counts.get(num) == targetCount) {
                result = num;
                break;
            }
        }

        return result;
    }
}