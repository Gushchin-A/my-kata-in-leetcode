class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;
        while (left <= right) {
            int l = Math.abs(nums[left]);
            int r = Math.abs(nums[right]);
            if (l < r) {
                result[index--] = r * r;
                right--;
            } else {
                result[index--] = l * l;
                left++;
            }
        }

        return result;
    }
}