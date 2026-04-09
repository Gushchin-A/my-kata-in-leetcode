class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int startBase = 2;
        int endBase = n - startBase;

        for (int i = startBase; i <= endBase; i++) {
            String strNumber = Integer.toString(n, i);
            if (!isPalindromicNumber(strNumber)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromicNumber(String strNumber) {
        int left = 0;
        int right = strNumber.length() - 1;

        while (left < right) {
            if (strNumber.charAt(left) != strNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}