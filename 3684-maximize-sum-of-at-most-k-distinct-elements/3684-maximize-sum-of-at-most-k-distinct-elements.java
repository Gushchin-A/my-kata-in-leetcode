class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int[] result = new int[k];

        int indexRes = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                } else {
                    result[indexRes++] = nums[i];
                    k--;
                }
            } else {
                result[indexRes++] = nums[i];
                k--;
            }

            if (k == 0) {
                break;
            }
        }

        return Arrays.copyOf(result, indexRes);
    }
}
