class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean wasVowel = false;
        boolean wasСonsonant = false;

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowels(Character.toLowerCase(ch))) {
                    wasVowel = true;
                } else {
                    wasСonsonant = true;
                }
            } else if (Character.isDigit(ch)) {
                continue;
            } else {
                return false;
            }
        }

        return wasVowel && wasСonsonant;
    }

    private boolean isVowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}
