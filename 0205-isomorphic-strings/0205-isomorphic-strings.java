class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] isWasS = new int[256];
        int[] isWasT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);

            if (isWasS[currentS] != isWasT[currentT]) {
                return false;
            }
            isWasS[currentS] = i + 1;
            isWasT[currentT] = i + 1;
        }

        return true;
    }
}