class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;

        int pointer;
        for (int i = 0; i < n; i++) {
            boolean indexEven = i % 2 == 0;
            int current = nums[i];

            if (indexEven) {
                if (current % 2 != 0) {
                    pointer = i + 1;
                    while (pointer < n) {
                        if (nums[pointer] % 2 == 0) {
                            nums[i] = nums[pointer];
                            nums[pointer] = current;
                            break;
                        } else {
                            pointer++;
                        }
                    }
                }
            } else {
                if (current % 2 == 0) {
                    pointer = i + 1;
                    while (pointer < n) {
                        if (nums[pointer] % 2 != 0) {
                            nums[i] = nums[pointer];
                            nums[pointer] = current;
                            break;
                        } else {
                            pointer++;
                        }
                    }
                }
            }
        }

        return nums;
    }
}