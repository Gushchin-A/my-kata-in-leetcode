class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : arr) {
            counts.merge(num, 1, Integer::sum);
        }

        Set<Integer> uniqCounts = new HashSet<>();
        for (Integer count : counts.values()) {
            if (!uniqCounts.add(count)) {
                return false;
            }
        }

        return true;
    }
}