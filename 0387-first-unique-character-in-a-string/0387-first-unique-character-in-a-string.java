class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            storage.put(s.charAt(i), storage.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (storage.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}