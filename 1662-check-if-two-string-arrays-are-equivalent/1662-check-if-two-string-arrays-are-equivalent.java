class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int a = 0;
        int i = 0;

        int b = 0;
        int j = 0;

        while (a < word1.length && b < word2.length) {
            if (word1[a].charAt(i) != word2[b].charAt(j)) {
                return false;
            }
            i++;
            j++;


            if (i == word1[a].length()) {
                a++;
                i = 0;
            }

            if (j == word2[b].length()) {
                b++;
                j = 0;
            }
        }

        return a == word1.length && b == word2.length;
    }
}