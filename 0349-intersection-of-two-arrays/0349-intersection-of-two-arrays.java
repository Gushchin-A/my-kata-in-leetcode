class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int tempLength = nums1.length > nums2.length ? nums1.length : nums2.length;

        int[] result = new int[tempLength];
        int indexResult = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (indexResult > 0) {
                        int x = 0;
                        while (x < indexResult) {
                            if (nums1[i] == result[x]) {
                                break;
                            }
                            x++;
                        }
                        if (x == indexResult) {
                            result[indexResult] = nums1[i];
                            indexResult++;
                        }
                    } else {
                        result[indexResult] = nums1[i];
                        indexResult++;
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(result, indexResult);
    }
}