class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> ranks = new HashMap<>();

        Set<Integer> sortedUniq = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            sortedUniq.add(arr[i]);
        }
        
        int rank = 1;
        for (Integer num : sortedUniq) {
            ranks.put(num, rank++);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ranks.get(arr[i]);
        }

        return arr;
    }
}