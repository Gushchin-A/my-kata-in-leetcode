class Solution {
    public int alternatingSum(int[] nums) {
        int alternatingSum = 0;
        int sign = 1;
        
        for (int n : nums) {
            alternatingSum += n * sign;
            sign = -sign;
        }

        return alternatingSum;
    }
}