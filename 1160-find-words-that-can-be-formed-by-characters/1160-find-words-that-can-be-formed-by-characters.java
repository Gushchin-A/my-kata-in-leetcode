class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        
        for (String word : words) {

            int[] letters = new int[26];
            for (char c : chars.toCharArray()) {
                letters[c - 'a'] += 1;
            }

            boolean isGoodWord = true;
            for (char c : word.toCharArray()) {
                letters[c - 'a'] -= 1;
                if (letters[c - 'a'] < 0) {
                    isGoodWord = false;
                    break;
                }
            }

            if (isGoodWord) {
                result += word.length();
            }
        }

        return result;
    }
}