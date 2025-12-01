class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index] = num;
                index += 2;
            }
        }

        index = 1;
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index] = num;
                index += 2;
            }
        }

        return result;
    }
}