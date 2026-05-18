class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] seen1 = new boolean[101];
        boolean[] seen2 = new boolean[101];

        int length = Math.max(nums1.length, nums2.length);
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                seen1[nums1[i]] = true;
            }
            if (i < nums2.length) {
                seen2[nums2[i]] = true;
            }
        }

        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                if (seen2[nums1[i]]) {
                    result[0]++;
                }
            }
            if (i < nums2.length) {
                if (seen1[nums2[i]]) {
                    result[1]++;
                }
            }
        }
        
        return result;
    }
}