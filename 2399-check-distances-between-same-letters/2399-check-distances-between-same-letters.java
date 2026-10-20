class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> firstIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (firstIndex.containsKey(c)) {
                int between = i - firstIndex.get(c) - 1;
                if (between != distance[c - 'a']) {
                    return false;
                }
            } else {
                firstIndex.put(c, i);
            }
        }

        return true;
    }
}