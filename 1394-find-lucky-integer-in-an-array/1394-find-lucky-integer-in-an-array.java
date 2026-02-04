class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : arr) {
            counts.merge(num, 1, Integer::sum);
        }

        int result = -1;
        for (Map.Entry<Integer, Integer> num : counts.entrySet()) {
            if (num.getKey().equals(num.getValue())) {
                if (num.getKey() > result) {
                    result = num.getKey();
                }
            }
        }

        return result;
    }
}