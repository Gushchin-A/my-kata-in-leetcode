class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        int startCookie = 0;
        for (int i = 0; i < g.length; i++) {
            if (startCookie >= s.length) {
                break;
            }

            for (int j = startCookie; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    result++;
                    startCookie = j + 1;
                    break;
                } else {
                    startCookie = j;
                }
            }
        }

        return result;
    }
}
