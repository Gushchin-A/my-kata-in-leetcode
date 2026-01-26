class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreatersElements = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            nextGreatersElements[i] = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    nextGreatersElements[i] = nums2[j];
                    break;
                }
            }
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreatersElements[j];
                }
            }
        }

        return result;
    }
}