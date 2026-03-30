class Solution {
    private static final int[] lettersLine = {1, 2, 3, 4, 5, 6, 7, 8};
    private static final String black = "black";
    private static final String white = "white";

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String color1;
        int first1 = lettersLine[coordinate1.charAt(0) - 'a'];
        int second1 = coordinate1.charAt(1) - '0';
        if (first1 % 2 == 0 && second1 % 2 == 0
                || first1 % 2 != 0 && second1 % 2 != 0) {
            color1 = black;
        } else {
            color1 = white;
        }
        
        String color2;
        int first2 = lettersLine[coordinate2.charAt(0) - 'a'];
        int second2 = coordinate2.charAt(1) - '0';
        if (first2 % 2 == 0 && second2 % 2 == 0
                || first2 % 2 != 0 && second2 % 2 != 0) {
            color2 = black;
        } else {
            color2 = white;
        }
        
        return color1.equals(color2);
    }
}
