class Solution {
    public int findFinalValue(int[] nums, int original) {
        if (nums.length == 0) {
            return original;
        }

        HashSet<Integer> numbers = new HashSet<>();

        for (int n : nums) {
            numbers.add(n);
        }

        boolean notFound = false;
        while (!notFound) {
            if (numbers.contains(original)) {
                original *= 2;
            } else {
                notFound = true;
            }
        }

        return original;
    }
}