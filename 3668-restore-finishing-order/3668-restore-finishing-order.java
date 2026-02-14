class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < order.length; j++) {
                if (friends[i] == order[j]) {
                    freq.put(friends[i], j + 1);
                }
            }
        }

        int[] result = new int[friends.length];
        int indexRes = 0;
        for (int id : order) {
            if (freq.containsKey(id)) {
                result[indexRes++] = id;
            }
        }

        return result;
    }
}