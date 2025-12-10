class NumArray {
    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        System.arraycopy(nums, 0, this.nums, 0, nums.length);
    }
    
    public int sumRange(int left, int right) {
        if (left < 0 || right > nums.length - 1) {
            throw new IllegalArgumentException("Left must be >= 0. Right must <= last element");
        }
        
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */