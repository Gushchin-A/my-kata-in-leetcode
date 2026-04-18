class Solution {
    public int countAsterisks(String s) {
        boolean inPair = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '|') {
                inPair = !inPair;
            }
            if (c == '*' && !inPair) {
                count++;
            }
        }

        return count;
    }
}