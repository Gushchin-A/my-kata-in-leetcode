class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] letters = new int[26];
        for (char c : chars.toCharArray()) {
            letters[c - 'a'] += 1;
        }
            
        int result = 0;
        
        for (String word : words) {

            int[] need = new int[26];
            boolean isGoodWord = true;

            for (char c : word.toCharArray()) {
                need[c - 'a'] += 1;
                if (need[c - 'a'] > letters[c - 'a']) {
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