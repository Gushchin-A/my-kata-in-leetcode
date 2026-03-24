class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int x = 0;
        int y = n;
        int indexRes = 0;
        while (x < n) {
            result[indexRes++] = nums[x++];
            result[indexRes++] = nums[y++];
        }

        return result;
    }
}