class Solution {
    public String[] findRelativeRanks(int[] score) {
        int RowScoreAndIndex = 2;
        int[][] pairs = new int[score.length][RowScoreAndIndex];

        for (int i = 0; i < score.length; i++) {
            pairs[i][0] = i;
            pairs[i][1] = score[i];
        }

        Arrays.sort(pairs, (a,b) -> Integer.compare(b[1], a[1]));
        String[] prizes = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int maxPrize = 3;
            result[pairs[i][0]] = i < maxPrize ? prizes[i] : String.valueOf(i + 1);
        }

        return result;
    }
}
