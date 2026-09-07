class Solution {
    public int sumCounts(List<Integer> nums) {
        int result = 0;

        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> uniq = new HashSet<>();
            uniq.add(nums.get(i));
            result += 1;

            for (int j = i + 1; j < nums.size(); j++) {
                uniq.add(nums.get(j));
                result += uniq.size() * uniq.size();
            }
        }

        return result;
    }
}