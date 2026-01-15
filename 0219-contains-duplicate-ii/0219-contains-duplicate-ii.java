class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (index.containsKey(current)) {
                int prev = index.get(current);
                if (i - prev <= k) {
                    return true;
                }
            }

            index.put(current, i);
        }

        return false;
    }
}