class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int maxSneakyNumbers = 2;
        int[] result = new int[maxSneakyNumbers];
        Set<Integer> uniq = new HashSet<>(nums.length - 2);

        int indexRes = 0;
        for (int num : nums) {
            if (!uniq.add(num)) {
                result[indexRes++] = num;
            }
        }

        return result;
    }
}