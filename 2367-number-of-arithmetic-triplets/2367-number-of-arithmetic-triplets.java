class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        int i = 0;
        while (i < nums.length - 2) {
            int j = i + 1;
            while (j < nums.length - 1) {
                if (nums[j] - nums[i] == diff) {
                    int k = j + 1;
                    while (k < nums.length) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                            break;
                        } else {
                            k++;
                        }
                    }
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }

        return count;
    }
}