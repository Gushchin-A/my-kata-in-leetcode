class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        List<Integer> triplets = new ArrayList<>();

        int i = 0;
        while (i < nums.length - 2) {
            int j = i + 1;
            while (j < nums.length - 1) {
                if (nums[j] - nums[i] == diff) {
                    int k = j + 1;
                    while (k < nums.length) {
                        if (nums[k] - nums[j] == diff) {
                            triplets.add(i);
                            triplets.add(j);
                            triplets.add(k);
                            k++;
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

        return triplets.size() / 3;
    }
}