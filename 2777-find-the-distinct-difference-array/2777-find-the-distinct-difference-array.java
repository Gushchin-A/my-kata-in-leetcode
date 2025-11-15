class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];

        Set<Integer> distinct = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                list.add(nums[j]);
            }
            distinct.addAll(list);
            int prefix = distinct.size();

            distinct.clear();
            list.clear();
            
            for (int x = n - 1; x >= i + 1; x--) {
                list.add(nums[x]);
            }
            distinct.addAll(list);
            int suffix = distinct.size();

            diff[i] = prefix - suffix;

            distinct.clear();
            list.clear();
        }

        return diff;
    }
}