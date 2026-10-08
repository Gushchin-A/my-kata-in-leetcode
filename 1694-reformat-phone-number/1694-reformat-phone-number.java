class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int n = digits.length();
        for (int i = 0; i < n; i++) {
            if (n - i > 4) {
                result.append(digits.substring(i, i + 3));
                result.append('-');
                i += 2;
            } else if (n - i == 4) {
                result.append(digits.substring(i, i + 2));
                result.append('-');
                i += 2;

                result.append(digits.substring(i, n));
                break;
            } else if (n - i == 3) {
                result.append(digits.substring(i, n));
                break;
            } else if (n - i == 2) {
                result.append(digits.substring(i, n));
                break;
            }
        }

        return result.toString();
    }
}
