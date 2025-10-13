class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int mismatch = 2;
        int n = nums.length;
        int sumActual = n * (n + 1) / 2;

        int duplicate = 0;
        int sumUniq = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                sumUniq += nums[i];
                break;
            }
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            } else {
                sumUniq += nums[i];
            }
        }

        int missNumber = sumActual - sumUniq;

        int[] result = new int[mismatch];
        result[0] = duplicate;
        result[1] = missNumber;

        return result;
    }
}
