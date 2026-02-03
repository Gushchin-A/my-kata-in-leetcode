class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> ranks = new HashMap<>();

        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);

        int rank = 1;
        for (int num : sorted) {
            if (!ranks.containsKey(num)) {
                ranks.put(num, rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ranks.get(arr[i]);
        }

        return arr;
    }
}