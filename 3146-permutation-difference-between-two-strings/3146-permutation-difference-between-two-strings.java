class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> sIndices = new HashMap<>();
        Map<Character, Integer> tIndices = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sIndices.put(s.charAt(i), i);
            tIndices.put(t.charAt(i), i);
        }

        int permutationDifference = 0;
        for (Map.Entry<Character, Integer> entry : sIndices.entrySet()) {
            int sIndex = sIndices.get(entry.getKey());
            int tIndex = tIndices.get(entry.getKey());
            permutationDifference += Math.abs(sIndex - tIndex);
        }

        return permutationDifference;
    }
}