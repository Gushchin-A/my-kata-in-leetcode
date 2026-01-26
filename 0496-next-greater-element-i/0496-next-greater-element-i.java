class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int[] temp = new int[nums2.length - j - 1];
                    System.arraycopy(nums2, j + 1, temp, 0, temp.length);
                    int nextMax = nextMaxElementInArray(temp, nums2[j]);

                    if (nextMax > nums2[j]) {
                        result[i] = nextMax;
                    } else {
                        result[i] = -1;
                    }
                }
            }
        }

        return result;
    }

    public int nextMaxElementInArray(int[] nums, int than) {
        if (nums.length == 0) {
            return -1;
        }

        int nextMax = -1;
        for (int num : nums) {
            if (num > than) {
                nextMax = num;
                break;
            }
        }

        return nextMax;
    }
}