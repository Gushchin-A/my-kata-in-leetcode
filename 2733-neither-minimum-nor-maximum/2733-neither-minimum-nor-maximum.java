class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int result = -1;
        for (int num : nums) {
            if (num < max && num > min) {
                result = num;
            }
        }
        
        return result;
    }
}
