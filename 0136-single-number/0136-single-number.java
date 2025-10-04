class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int n = nums.length;
        
        if (nums[0] != nums[1]) {
            return nums[0];
        }

        int result = 0;
        int j = 2;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[n - 1]) {
                result = nums[i];
                break;
            }
            if (nums[i] != nums[j] && nums[i] != nums[i - 1]) {
                result = nums[i];
                break;
            } else {
                j++;
            }
        }
        
        return result;
    }
}