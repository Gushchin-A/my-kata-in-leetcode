class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        boolean[] alreadyPair = new boolean[words.length];

        int result = 0;
        for (int i = 0; i < words.length; i++) {
            if (alreadyPair[i]) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (alreadyPair[j]) {
                    continue;
                }
                if (isReversedPair(words[i], words[j])) {
                    result++;
                    alreadyPair[i] = true;
                    alreadyPair[j] = true;
                }
            }
        }

        return result;
    }

    private boolean isReversedPair(String pair1, String pair2) {
        if (pair1.charAt(0) == pair2.charAt(1) && pair1.charAt(1) == pair2.charAt(0)) {
            return true;
        }

        return false;
    }
}