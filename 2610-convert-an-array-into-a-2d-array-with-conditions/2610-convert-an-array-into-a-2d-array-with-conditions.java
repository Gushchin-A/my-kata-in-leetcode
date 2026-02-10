class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        int maxRow = 0;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > maxRow) {
                maxRow = counts.get(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        int i = 0;
        while (i < maxRow) {
            
            List<Integer> row = new ArrayList<>();

            for (Map.Entry<Integer, Integer> keyValue : counts.entrySet()) {
                int key = keyValue.getKey();
                int value = keyValue.getValue();
                if (value != 0) {
                    row.add(key);
                    counts.put(key, counts.get(key) - 1);
                }
            }

            result.add(row);
            i++;
        }
        
        return result;
    }
}