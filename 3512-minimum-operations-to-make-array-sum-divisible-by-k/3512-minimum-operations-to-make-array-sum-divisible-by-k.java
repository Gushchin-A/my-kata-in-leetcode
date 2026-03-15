class Solution {
    public int minOperations(int[] nums, int k) {
        int operation = 0;
        int sum = sumArray(nums);

        while (true) {
            if (sum % k == 0) {
                break;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        nums[i] = nums[i] - 1;
                        operation++;
                        sum--;
                        break;
                    }
                }
            }
        }

        return operation;
    }

    private int sumArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}