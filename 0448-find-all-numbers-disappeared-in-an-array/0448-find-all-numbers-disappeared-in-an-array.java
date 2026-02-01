class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> allNums = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            allNums.put(i, 1);
        }

        for (int num : nums) {
            allNums.remove(num);
        }

        return new ArrayList<>(allNums.keySet());
    }
}