class Solution {
    public void moveZeroes(int[] nums) {
        int insert = 0;

        for (int n : nums) {
            if (n != 0) {
                nums[insert] = n;
                insert++;
            }
        }

        for (int i = insert; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}