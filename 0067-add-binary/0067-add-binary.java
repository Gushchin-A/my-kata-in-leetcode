class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = i < 0 ? 0 : a.charAt(i) - '0';
            int digitB = j < 0 ? 0 : b.charAt(j) - '0';
            int temp = (carry + digitA + digitB) % 2 == 0 ? 0 : 1;

            result.append(temp);
            carry = (carry + digitA + digitB) / 2;

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}