class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<>();

        for (int num : nums) {
            uniq.add(num);
        }

        return uniq.size() != nums.length;
    }
}