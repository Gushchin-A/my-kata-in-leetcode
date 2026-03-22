class Solution {
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        for (int num : nums) {
            int temp = num % 2 == 0 ? 0 : 1;
            if (temp == 0) {
                result[left++] = temp;
            } else {
                result[right--] = temp;
            }
        }
        
        return result;
    }
}
