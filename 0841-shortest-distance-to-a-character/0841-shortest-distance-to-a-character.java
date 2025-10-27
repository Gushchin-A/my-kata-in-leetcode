class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int INF = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            result[i] = INF;
        }

        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(j) == c) {
                while (i <= j) {
                    result[i] = j - i;
                    i++;
                }
            }
            j++;
        }

        i = s.length() - 1;
        j = s.length() - 1;
        while (j >= 0) {
            if (s.charAt(j) == c) {
                while (i >= j) {
                    result[i] = Math.min(Math.abs(j - i), result[i]);
                    i--;
                }
            }
            j--;
        }

        return result;
    }
}