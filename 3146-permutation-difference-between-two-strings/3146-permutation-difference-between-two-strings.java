class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] sIndices = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sIndices[s.charAt(i) - 'a'] = i;

        }

        int permutationDifference = 0;
        for (int i = 0; i < t.length(); i++) {
            int sIndex = sIndices[t.charAt(i) - 'a'];
            int tIndex = i;
            permutationDifference += Math.abs(sIndex - tIndex);
        }

        return permutationDifference;
    }
}