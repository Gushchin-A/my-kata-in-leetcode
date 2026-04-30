class Solution {
    public int maxProductDifference(int[] nums) {
        int maxFirst = Integer.MIN_VALUE;;
        int maxSecond = maxFirst;

        int minFirst = Integer.MAX_VALUE;;
        int minSecond = minFirst;

        for (int num : nums) {
            if (num > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (num > maxSecond) {
                maxSecond = num;
            }

            if (num < minFirst) {
                minSecond = minFirst;
                minFirst = num;
            } else if (num < minSecond) {
                minSecond = num;
            }
        }

        return (maxFirst * maxSecond) - (minFirst * minSecond);
    }
}