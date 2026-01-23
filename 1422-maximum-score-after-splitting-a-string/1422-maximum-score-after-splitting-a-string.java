class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int i = 0;
        int max = 0;
        while (i < n - 1) {
            int maxLeft = sumInArrayNumZero(s.substring(0, i + 1).toCharArray());
            int maxRight = sumInArrayNumOne(s.substring(i + 1, n).toCharArray());

            max = Math.max(max, maxLeft + maxRight);
            i++;
        }

        return max;
    }

    public int sumInArrayNumZero(char[] charNums) {
        int sum = 0;
        for (char c : charNums) {
            if (c == '0') {
                sum++;
            }
        }

        return sum;
    }

    public int sumInArrayNumOne(char[] charNums) {
        int sum = 0;
        for (char c : charNums) {
            if (c == '1') {
                sum++;
            }
        }

        return sum;
    }
}