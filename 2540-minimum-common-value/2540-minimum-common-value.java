class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int result = -1;

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                if (nums1[i] == nums2[j]) {
                    int candidate = nums1[i];
                    if (candidate <= nums1[nums1.length - 1] || candidate <= nums2[nums2.length - 1]) {
                        return candidate;
                    }
                } else {
                    j++;
                }
            }
        }

        return result;
    }
}