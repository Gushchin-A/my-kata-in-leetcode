class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];

        int i = 0;
        int j = 0;
        int right = s.length();
        int left = -1;
        int INF = Integer.MAX_VALUE;
        while (i < s.length()) {
            if (s.charAt(i) != c) {
                j = i;
                while (j >= 0) {
                    if (s.charAt(j) == c) {
                        left = j;
                        break;
                    } else {
                        j--;
                    }
                }
                j = i;
                while (j < s.length()) {
                    if (s.charAt(j) == c) {
                        right = j;
                        break;
                    } else {
                        j++;
                    }
                }
                int leftDistance = left == -1 ? INF : i - left;
                int rightDistance = right == s.length() ? INF : Math.abs(right - i);
                result[i] = Math.min(leftDistance, rightDistance);
                i++;
            } else {
                result[i] = 0;
                i++;
            }
        }

        return result;
    }
}