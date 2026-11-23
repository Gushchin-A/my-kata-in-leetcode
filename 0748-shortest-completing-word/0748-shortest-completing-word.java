class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freqNeed = new int[26];

        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                freqNeed[Character.toLowerCase(ch) - 'a']++;
            }
        }
        
        int[] indicesAndLengths = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            boolean foundWord = true;
            int[] freqCandidate = new int[26];

            for (char ch : words[i].toCharArray()) {
                freqCandidate[ch - 'a']++;
            }

            for (int j = 0; j < freqNeed.length; j++) {
                if (freqCandidate[j] < freqNeed[j]) {
                    foundWord = false;
                    indicesAndLengths[i] = Integer.MAX_VALUE;
                    break;
                }
            }

            if (foundWord) {
                indicesAndLengths[i] = words[i].length();
            }
        }

        int min = Integer.MAX_VALUE;
        int indexResult = 0;
        for (int i = 0; i < indicesAndLengths.length; i++) {
            if (indicesAndLengths[i] < min) {
                min = indicesAndLengths[i];
                indexResult = i;
            }
        }

        return words[indexResult];
    }
}
