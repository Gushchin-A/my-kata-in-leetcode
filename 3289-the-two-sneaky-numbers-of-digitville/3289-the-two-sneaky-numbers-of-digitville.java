class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int maxSneakyNumbers = 2;
        int[] result = new int[maxSneakyNumbers];
        boolean[] seen = new boolean[nums.length];

        int indexRes = 0;
        for (int num : nums) {
            if (seen[num]) {
                result[indexRes++] = num;
            } else {
                seen[num] = true;
            }
            if (indexRes == maxSneakyNumbers) {
                break;
            }
        }

        return result;
    }
}