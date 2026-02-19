class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] seen = new boolean[101];
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            seen[num] = true;
        }

        if (1 + (max - min) == nums.length) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }
}