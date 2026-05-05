class Solution {
    public boolean isBalanced(String num) {
        int sumEven = 0;
        int sumOdd = 0;
        
        for (int i = 0; i < num.length(); i += 2) {
            sumEven += num.charAt(i) - '0';
            if (i + 1 < num.length()) {
                sumOdd += num.charAt(i + 1) - '0';
            }
        }

        return sumEven == sumOdd;
    }
}