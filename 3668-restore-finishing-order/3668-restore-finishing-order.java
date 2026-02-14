class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> myFriends = new HashSet<>();
        for (int f : friends) {
            myFriends.add(f);
        }

        int[] result = new int[friends.length];
        int indexRes = 0;
        for (int id : order) {
            if (myFriends.contains(id)) {
                result[indexRes++] = id;
            }
        }

        return result;
    }
}