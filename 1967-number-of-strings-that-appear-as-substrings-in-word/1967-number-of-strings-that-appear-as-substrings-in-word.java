class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;

        for (String p : patterns) {
            if (word.contains(p)) {
                result++;
            }
        }

        return result;
    }
}
