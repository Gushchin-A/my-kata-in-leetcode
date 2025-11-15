class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        
        Set<Integer> distinct = new HashSet<>();
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                distinct.add(nums[j]);
            }
            int prefix = distinct.size();

            distinct.clear();

            for (int x = n - 1; x >= i + 1; x--) {
                distinct.add(nums[x]);
            }
            int suffix = distinct.size();

            diff[i] = prefix - suffix;

            distinct.clear();
        }

        return diff;
    }
}