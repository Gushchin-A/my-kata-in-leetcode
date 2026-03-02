class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder result = new StringBuilder();

        int seen = 0;
        for (String word : s.split(" ")) {
            if (seen == k) {
                break;
            }
            result.append(word);
            result.append(" ");
            seen++;
        }
        result.setLength(result.length() - 1);

        return result.toString();
    }
}