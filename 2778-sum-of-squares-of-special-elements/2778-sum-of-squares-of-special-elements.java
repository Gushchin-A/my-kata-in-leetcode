class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int result = 0;

        int i = 1;
        for (int num : nums) {
            if (n % i == 0) {
                result += num * num;
            }
            i++;
        }

        return result;
    }
}