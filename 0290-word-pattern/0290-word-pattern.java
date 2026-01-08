class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arrayS = s.split(" ");

        if (pattern.length() != arrayS.length) {
            return false;
        }

        Map<Character, String> mapChars = new HashMap<>();
        Map<String, Character> mapWords = new HashMap<>();

        for (int i = 0; i < arrayS.length; i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = arrayS[i];

            if (mapChars.containsKey(currentChar)) {
                if (!mapChars.get(currentChar).equals(currentWord)) {
                    return false;
                }
            }

            if (mapWords.containsKey(currentWord)) {
                if (mapWords.get(currentWord) != currentChar) {
                    return false;
                }
            }

            mapChars.put(currentChar, currentWord);
            mapWords.put(currentWord, currentChar);
        }

        return true;
    }
}