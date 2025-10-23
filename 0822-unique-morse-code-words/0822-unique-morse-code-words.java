class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseTable = {".-", "-...", "-.-.", "-..", ".", "..-.", "--." ,
        "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
        ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> uniqCodes = new HashSet<>();

        for (String w : words) {
            StringBuilder translatedWord = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                String morseCode = morseTable[w.charAt(i) - 'a'];
                translatedWord.append(morseCode);
            }
            uniqCodes.add(translatedWord.toString());
        }

        return uniqCodes.size();
    }
}