class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        for (int element : nums) {
            if (element % 2 == 0) {
                result[left] = element;
                left++;
            } else {
                result[right] = element;
                right--;
            }
        }
        return result;
    }
}