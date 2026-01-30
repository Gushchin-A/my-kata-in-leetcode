class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mapNums1 = new HashMap<>();
        Map<Integer, Integer> mapNums2 = new HashMap<>();

        for (int num : nums1) {
            mapNums1.merge(num, 1, Integer::sum);
        }
        
        for (int num : nums2) {
            mapNums2.merge(num, 1, Integer::sum);
        }

        int[] numsMin = nums1.length < nums2.length ? nums1 : nums2;
        Set<Integer> uniq = new HashSet<>();
        for (int num : numsMin) {
            uniq.add(num);
        }

        int[] result = new int[nums1.length + nums2.length];
        int indexRes = 0;
        for (Integer num : uniq) {
            int valueMapNums1 = mapNums1.get(num) == null ? 0 : mapNums1.get(num);
            int valueMapNums2 = mapNums2.get(num) == null ? 0 : mapNums2.get(num);
            int count = Math.min(valueMapNums1, valueMapNums2);

            for (int i = 0; i < count; i++) {
                result[indexRes++] = num;
            }
        }

        return Arrays.copyOf(result, indexRes);
    }
}