class Solution {
    public String reformat(String s) {
        int minRangeDigit = 48;
        int maxRangeDigit = 57;

        int digitCount = 0;
        int lettersCount = 0;
        for (char c : s.toCharArray()) {
            if (c >= minRangeDigit && c <= maxRangeDigit) {
                digitCount++;
            } else {
                lettersCount++;
            }
        }

        if (Math.abs(digitCount - lettersCount) > 1) {
            return "";
        }

        char[] result = new char[s.length()];
        int digit = digitCount >= lettersCount ? 0 : 1;
        int letter = lettersCount > digitCount ? 0 : 1;

        for (char c : s.toCharArray()) {
            if (c >= minRangeDigit && c <= maxRangeDigit) {
                result[digit] = c;
                digit += 2;
            } else {
                result[letter] = c;
                letter += 2;
            }
        }
        
        return new String(result);
    }
}