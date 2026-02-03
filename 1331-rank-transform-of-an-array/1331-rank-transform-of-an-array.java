class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> ranks = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            ranks.put(arr[i], 0);
        }
        
        int rank = 1;
        for (Integer num : ranks.keySet()) {
            ranks.put(num, rank++);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ranks.get(arr[i]);
        }

        return arr;
    }
}