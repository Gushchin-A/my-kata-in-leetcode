class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;

        int[] result = new int[n * 2];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
        }

        int indexResult = result.length - 1;
        for (int i = 0; i < n; i++) {
            result[indexResult--] = nums[i];
        }

        return result;
    }
}
