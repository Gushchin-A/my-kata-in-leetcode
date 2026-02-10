class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, copy.length);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        Set<Integer> tempUniq = new HashSet<>();

        int index = 0;
        int seen = 0;
        while (seen < copy.length) {

            if (tempUniq.add(copy[index]) && copy[index] != -1) {
                row.add(copy[index]);
                copy[index] = -1;
                seen++;
            }

            if (index == copy.length - 1) {
                result.add(row);
                row = new ArrayList<>();
                tempUniq = new HashSet<>();
                index = 0;
            }

            index++;
        }

        if (!row.isEmpty()) {
            result.add(row);
        }

        return result;
    }
}