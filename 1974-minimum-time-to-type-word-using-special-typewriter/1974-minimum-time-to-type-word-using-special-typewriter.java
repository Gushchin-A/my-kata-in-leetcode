class Solution {
    public int minTimeToType(String word) {
        int n = word.length();
        int seconds = n;
        int from = 'a';

        for (int i = 0; i < n; i++) {
            int distance = Math.abs(from - word.charAt(i));
            seconds += Math.min(distance, 26 - distance);

            from = word.charAt(i);
        }

        return seconds;
    }
}