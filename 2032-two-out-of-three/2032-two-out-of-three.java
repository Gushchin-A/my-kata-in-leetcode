class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums1) {
            freq.merge(n, 1, Integer::sum);
        }

        Set<Integer> result = new HashSet<>();

        Set<Integer> uniq1 = new HashSet<>();
        for (int n : nums2) {
            if (!uniq1.add(n)) {
                continue;
            }
            if (freq.containsKey(n)) {
                result.add(n);
            }
            freq.merge(n, 1, Integer::sum);
        }

        Set<Integer> uniq2 = new HashSet<>();
        for (int n : nums3) {
            if (!uniq2.add(n)) {
                continue;
            }
            if (freq.containsKey(n)) {
                result.add(n);
            }
        }

        return new ArrayList<>(result);
    }
}
