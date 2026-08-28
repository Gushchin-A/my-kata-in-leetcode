class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0) - 97 + 1;
        int num = coordinates.charAt(1) - '0';

        if (letter % 2 == 0 && num % 2 == 0) {
            return false;
        } else if (letter % 2 != 0 && num % 2 != 0) {
            return false;
        }

        return true;
    }
}
