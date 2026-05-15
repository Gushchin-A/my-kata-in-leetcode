class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                count += num1 % (num2 * k) == 0 ? 1 : 0;
            }
        }

        return count;
    }
}