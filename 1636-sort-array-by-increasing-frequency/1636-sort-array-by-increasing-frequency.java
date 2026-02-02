class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());
        list.sort((k1, k2) -> {
            int resultCompare = k1.getValue().compareTo(k2.getValue());
            if (resultCompare != 0) {
                return resultCompare;
            } else {
                return k2.getKey().compareTo(k1.getKey());
            }
        });
        
        int[] result = new int[nums.length];
        int indexRes = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int i = 0;
            while (i < entry.getValue()) {
                result[indexRes++] = entry.getKey();
                i++;
            }
        }

        return result;
    }
}