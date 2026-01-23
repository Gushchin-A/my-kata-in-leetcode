class Solution {
    public int maxScore(String s) {
        char[] charNums = s.toCharArray();
        int n = charNums.length;

        int i = 0;
        int max = 0;
        while (i < n - 1) {

            int j = 0;
            int maxLeft = 0;
            while (j <= i) {
                if (charNums[j] == '0') {
                    maxLeft += 1;
                }
                j++;
            }

            int k = n - 1;
            int maxRight = 0;
            while (k > i) {
                if (charNums[k] == '1') {
                    maxRight += 1;
                }
                k--;
            }

            max = Math.max(max, maxLeft + maxRight);
            i++;
        }

        return max;
    }
}