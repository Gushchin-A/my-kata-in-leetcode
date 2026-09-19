class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] largest = new int[n];
        int[] smallest = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            largest[i] = max;
        }

        int min = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            smallest[i] = min;
        }

        for (int i = 0; i < n; i++) {
            if (largest[i] - smallest[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}
