class Solution {
    public int maximum69Number(int num) {
        char[] numberChars = Integer.toString(num).toCharArray();

        for (int i = 0; i < numberChars.length; i++) {
            if (numberChars[i] - '0' == 6) {
                numberChars[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(numberChars));
    }
}
