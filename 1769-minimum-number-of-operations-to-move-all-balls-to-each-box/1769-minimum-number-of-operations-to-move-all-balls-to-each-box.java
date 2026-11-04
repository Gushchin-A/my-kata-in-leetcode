class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i && boxes.charAt(j) != '0') {
                    answer[i] += Math.abs(i - j);
                }
            }
        }

        return answer;
    }
}