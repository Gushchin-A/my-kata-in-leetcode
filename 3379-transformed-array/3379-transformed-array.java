class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int position = ((i + nums[i]) % n + n) % n;
            result[i] = nums[position];
        }

        return result;
    }
}
