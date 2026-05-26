class Solution {
    public int countBinarySubstrings(String s) {
        int prevGroup = 0;
        int currentGroup = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentGroup++;
            } else {
                count += Math.min(currentGroup, prevGroup);
                prevGroup = currentGroup;
                currentGroup = 1;
            }
        }

        count += Math.min(currentGroup, prevGroup);

        return count;
    }
}