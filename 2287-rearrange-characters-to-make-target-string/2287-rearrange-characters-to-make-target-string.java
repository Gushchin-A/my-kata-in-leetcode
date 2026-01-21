class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> sCounts = new HashMap<>();
        Map<Character, Integer> targetCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            sCounts.merge(c, 1, Integer::sum);
        }

        for (char c : target.toCharArray()) {
            targetCounts.merge(c, 1, Integer::sum);
        }

        int maxTargetChars = 100;
        int min = maxTargetChars;
        for (Character key : targetCounts.keySet()) {
            if (sCounts.containsKey(key)) {
                int candidate = sCounts.getOrDefault(key, 0) / targetCounts.get(key);
                min = Math.min(min, candidate);
            } else {
                return 0;
            }
        }

        return min;
    }
}