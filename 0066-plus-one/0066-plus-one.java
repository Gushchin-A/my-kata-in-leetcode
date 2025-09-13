class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        int[] result = new int[l + 1];
        int carry = 1;

        int indexResult = result.length - 1;
        for (int i = l - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result[indexResult] = sum % 10;
            carry = sum / 10;
            indexResult--;
        }

        if (carry == 1) {
            result[0] = carry;
            return result;
        }

        return Arrays.copyOfRange(result, indexResult + 1, result.length);
    }
}
