class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] sIndices = new int[26];
        int[] tIndices = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sIndices[s.charAt(i) - 'a'] = i;
            tIndices[t.charAt(i) - 'a'] = i;

        }

        int permutationDifference = 0;
        for (int i = 0; i < s.length(); i++) {
            int sIndex = sIndices[s.charAt(i) - 'a'];
            int tIndex = tIndices[s.charAt(i) - 'a'];
            permutationDifference += Math.abs(sIndex - tIndex);
        }

        return permutationDifference;
    }
}