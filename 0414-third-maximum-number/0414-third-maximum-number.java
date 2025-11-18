class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = nums[0];
        for (int n : nums) {
            if (n > firstMax) {
                firstMax = n;
            }
        }

        int secondMax = nums[0];
        for (int n : nums) {
            if (n < firstMax) {
                secondMax = n;
            }
        }

        for (int n : nums) {
            if (n > secondMax && n < firstMax) {
                secondMax = n;
            }
        }

        int thirdMax = nums[0];
        for (int n : nums) {
            if (n < secondMax) {
                thirdMax = n;
            }
        }

        for (int n : nums) {
            if (n > thirdMax && n < secondMax) {
                thirdMax = n;
            }
        }

        if (firstMax != secondMax && secondMax != thirdMax) {
            return thirdMax;
        }

        return firstMax;
    }
}