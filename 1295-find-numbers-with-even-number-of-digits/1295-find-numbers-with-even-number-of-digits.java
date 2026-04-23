class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            int digits = (int) Math.log10(num) + 1;
            result += digits % 2 == 0 ? 1 : 0;
        }

        return result;
    }
}