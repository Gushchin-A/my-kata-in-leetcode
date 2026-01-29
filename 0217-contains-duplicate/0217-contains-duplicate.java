class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<>();

        for (int num : nums) {
            if (!uniq.add(num)) {
                return true;
            }
        }

        return false;
    }
}