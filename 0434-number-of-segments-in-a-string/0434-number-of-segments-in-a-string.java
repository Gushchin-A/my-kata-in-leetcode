class Solution {
    public int countSegments(String s) {
        int n = s.length();

        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (current != ' ') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        return count;
    }
}