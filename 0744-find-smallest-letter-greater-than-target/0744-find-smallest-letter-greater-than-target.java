class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];

        for (char ch : letters) {
            if (ch > target) {
                result = ch;
                break;
            }
        }

        return result;
    }
}
