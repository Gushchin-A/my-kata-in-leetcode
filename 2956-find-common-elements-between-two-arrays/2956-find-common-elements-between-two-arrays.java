class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> values1 = new HashSet<>();
        Set<Integer> values2 = new HashSet<>();

        int length = Math.max(nums1.length, nums2.length);
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                values1.add(nums1[i]);
            }
            if (i < nums2.length) {
                values2.add(nums2[i]);
            }
        }

        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                if (values2.contains(nums1[i])) {
                    result[0]++;
                }
            }
            if (i < nums2.length) {
                if (values1.contains(nums2[i])) {
                    result[1]++;
                }
            }
        }
        
        return result;
    }
}