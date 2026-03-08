class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copySorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copySorted);

        int maxDigit = 100;
        int[] counts = new int[maxDigit + 1];
        counts[copySorted[0]] = 0;
        for (int i = 1; i < copySorted.length; i++) {
            if (copySorted[i] != copySorted[i - 1]) {
                counts[copySorted[i]] = i;
            }
        }

        int[] result = new int[nums.length];
        int indexRes = 0;
        for (int num : nums) {
            result[indexRes++] = counts[num];
        }

        return result;
    }
}