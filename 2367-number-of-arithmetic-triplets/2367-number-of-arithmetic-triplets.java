class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            numbers.add(num);
        }

        int triplets = 0;
        for (int num : nums) {
            if (numbers.contains(num + diff) && numbers.contains(num + diff * 2)) {
                triplets++;
            }
        }

        return triplets;
    }
}