class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            int sumSubarray = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (i < k) {
                    sumSubarray += nums.get(i);
                }
                if (i == k - 1) {
                    if (sumSubarray <= 0) {
                        continue;
                    }
                    result = Math.min(result, sumSubarray);
                }
                if (i > k - 1) {
                    sumSubarray = sumSubarray - nums.get(i - k) + nums.get(i);
                    if (sumSubarray <= 0) {
                        continue;
                    }
                    result = Math.min(result, sumSubarray);
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
