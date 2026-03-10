class Solution {
    public int mostWordsFound(String[] sentences) {
        int maximumWords = 0;
        for (String sentence : sentences) {
            int temp = numberOfWordsInSentence(sentence);
            maximumWords = Math.max(maximumWords, temp);
        }

        return maximumWords;
    }

    private int numberOfWordsInSentence(String sentence) {
        int spaces = 0;
        for (char c : sentence.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }

        return spaces + 1;
    }
}