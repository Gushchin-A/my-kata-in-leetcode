class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
                if (i < nums.length - 1) {
                    if (nums[i + 1] != target) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}