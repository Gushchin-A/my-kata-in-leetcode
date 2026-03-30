class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int first1 = coordinate1.charAt(0) - 'a';
        int second1 = coordinate1.charAt(1) - '0';
        boolean color1 = first1 % 2 == second1 % 2;
        
        int first2 = coordinate2.charAt(0) - 'a';
        int second2 = coordinate2.charAt(1) - '0';
        boolean color2 = first2 % 2 == second2 % 2;
        
        return color1 == color2;
    }
}
