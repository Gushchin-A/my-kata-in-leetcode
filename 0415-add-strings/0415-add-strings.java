class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;

        StringBuilder tempResult = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            int digitOne = i < 0 ? 0 : Character.getNumericValue(num1.charAt(i));
            int digitTwo = j < 0 ? 0 : Character.getNumericValue(num2.charAt(j));

            if (carry > 0) {
                int current = digitOne + digitTwo + carry;
                tempResult.append(current % 10);
                carry = current / 10;
            } else {
                int current = digitOne + digitTwo;
                tempResult.append(current % 10);
                carry = current / 10;
            }
            i--;
            j--;

            if (i < 0 && j < 0 && carry > 0) {
                tempResult.append(carry);
            }
        }

        return reverseString(tempResult.toString());
    }

    public static String reverseString(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
