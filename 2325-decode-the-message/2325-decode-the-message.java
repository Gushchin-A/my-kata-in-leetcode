class Solution {
    public String decodeMessage(String key, String message) {
        int[] lettersPosition = new int[26];
        boolean[] seen = new boolean[26];

        int position = 0;
        for (char c : key.toCharArray()) {
            if (c != ' ') {
                if (!seen[c - 'a']) {
                    lettersPosition[c - 'a'] = position;
                    position++;
                    seen[c - 'a'] = true;
                }
            }
        }

        StringBuilder decode = new StringBuilder(message.length());
        for (char c : message.toCharArray()) {
            if (c != ' ') {
                decode.append((char) (lettersPosition[c - 'a'] + 'a'));
            } else {
                decode.append(c);
            }
        }

        return decode.toString();
    }
}