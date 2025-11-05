class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int multiplication = 1;
        int i = 0;
        while (i < n) {
            result[i] = multiplication;
            multiplication *= nums[i];
            i++;
        }

        multiplication = 1;
        i = n - 1;
        while (i >= 0) {
            result[i] *= multiplication;
            multiplication *= nums[i];
            i--;
        }

        return result;
    }
}