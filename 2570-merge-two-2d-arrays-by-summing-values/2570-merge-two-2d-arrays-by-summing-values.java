class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] temp = new int[nums1.length + nums2.length][2];

        int i = 0;
        int j = 0;
        int indexRes = 0;
        while (i < nums1.length || j < nums2.length) {

            if (i < nums1.length && j < nums2.length) {
                int id1 = nums1[i][0];
                int value1 = nums1[i][1];
                int id2 = nums2[j][0];
                int value2 = nums2[j][1];
                if (id1 == id2) {
                    temp[indexRes][0] = id1;
                    temp[indexRes++][1] = value1 + value2;
                    i++;
                    j++;
                } else {
                    if (id1 < id2) {
                        temp[indexRes][0] = id1;
                        temp[indexRes++][1] = value1;
                        i++;
                    } else {
                        temp[indexRes][0] = id2;
                        temp[indexRes++][1] = value2;
                        j++;
                    }
                }
            } else if (i < nums1.length) {
                int id1 = nums1[i][0];
                int value1 = nums1[i][1];

                temp[indexRes][0] = id1;
                temp[indexRes++][1] = value1;
                i++;
            } else {
                int id2 = nums2[j][0];
                int value2 = nums2[j][1];

                temp[indexRes][0] = id2;
                temp[indexRes++][1] = value2;
                j++;
            }
        }

        return Arrays.copyOf(temp, indexRes);
    }
}