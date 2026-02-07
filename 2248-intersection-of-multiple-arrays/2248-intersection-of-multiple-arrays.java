class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int[] row : nums) {
            for (int num : row) {
                counts.merge(num, 1, Integer::sum);
            }
        }

        List<Integer> result = new ArrayList<>();
        int needCount = nums.length;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == needCount) {
                result.add(entry.getKey());
            }
        }
        
        Collections.sort(result);

        return result;
    }
}