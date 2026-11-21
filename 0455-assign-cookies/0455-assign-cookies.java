class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        boolean hasCookies = true;
        int startCookie = 0;
        
        for (int i = 0; i < g.length; i++) {
            if (!hasCookies) {
                break;
            }

            for (int j = startCookie; j < s.length; j++) {
                if (j == s.length - 1) {
                    hasCookies = false;
                }

                if (s[j] >= g[i]) {
                    result++;
                    startCookie = j + 1;
                    break;
                }
            }
        }

        return result;
    }
}
