class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> uniq = new HashSet<>();

        for (int num : nums) {
            if (uniq.contains(num)) {
                return num;
            }
            uniq.add(num);
        }
        
        return -1;
    }
}