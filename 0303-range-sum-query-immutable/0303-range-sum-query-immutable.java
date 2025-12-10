class NumArray {
    private final int[] nums;

    public NumArray(int[] nums) {
        int[] temp = new int[nums.length + 1];
        
        temp[0] = 0;
        int indexTemp = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            temp[indexTemp++] = nums[i] + sum;
            sum += nums[i];
        }

        this.nums = temp;
    }
    
    public int sumRange(int left, int right) {
        if (left < 0 || right > nums.length - 2) {
            throw new IllegalArgumentException("Left must be >= 0. Right must <= last element");
        }
        
        return nums[right + 1] - nums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */