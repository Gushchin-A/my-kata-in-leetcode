class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x == 0 && x < 10) {
            return true;
        }

        String strX = Integer.toString(x);
        int i = 0;
        int j = strX.length() - 1;
        int halfLength = strX.length() / 2;
        while (i <= halfLength) {
            char left = strX.charAt(i);
            char right = strX.charAt(j);
            boolean same = left == right;
            if (!same) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }

        return true;
    }
}
