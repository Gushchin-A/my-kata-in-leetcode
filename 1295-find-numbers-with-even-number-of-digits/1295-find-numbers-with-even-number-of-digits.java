class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            int n = num;
            int digits = 0;
            while (n > 0) {
                n /= 10;
                digits++;
            }
            result += digits % 2 == 0 ? 1 : 0;
        }

        return result;
    }
}