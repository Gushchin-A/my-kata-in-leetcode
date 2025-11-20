class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
      
        int sum = 0;
        int stepPair = 2;
        for (int i = 0; i < n; i += stepPair) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }
}
