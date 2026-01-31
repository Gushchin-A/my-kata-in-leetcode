class Solution {
    public String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();

        int minRangeDigit = 48;
        int maxRangeDigit = 57;
        for (char c : s.toCharArray()) {
            if (c >= minRangeDigit && c <= maxRangeDigit) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int diffLength = Math.abs(digits.size() - letters.size());

        if (diffLength > 1) {
            return "";
        } else if (diffLength == 0) {
            int i = 0;
            while (i < digits.size()) {
                result.append(digits.get(i));
                result.append(letters.get(i));
                i++;
            }
            return result.toString();
        }

        List<Character> longerLength = digits.size() > letters.size()
                    ? digits : letters;
        List<Character> shorterLength = digits.size() < letters.size()
                ? digits : letters;

        int i = 0;
        while (i < shorterLength.size()) {
            result.append(longerLength.get(i));
            result.append(shorterLength.get(i));
            i++;
        }

        result.append(longerLength.getLast());

        return result.toString();
    }
}