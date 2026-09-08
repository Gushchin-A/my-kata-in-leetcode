class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.merge(num, 1, Integer::sum);
        }

        for (Integer value : counts.values()) {
            if (value % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
