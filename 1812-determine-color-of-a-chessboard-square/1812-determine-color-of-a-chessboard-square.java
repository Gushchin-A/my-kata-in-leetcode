class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0) - 97 + 1;
        int num = coordinates.charAt(1) - '0';

        return (letter + num) % 2 != 0;
    }
}
