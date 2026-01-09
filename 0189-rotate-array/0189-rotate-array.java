class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            temp[newIndex] = nums[i];
        }

        System.arraycopy(temp, 0, nums, 0, n);
    }
}