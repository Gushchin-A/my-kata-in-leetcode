class Solution {
    public String makeFancyString(String s) {
        int consecutive = 3;
        char[] temp = s.toCharArray();

        int duplicateCount = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            char current = s.charAt(i);
            char next = s.charAt(i + 1);

            if (current == next) {
                duplicateCount++;
            } else {
                duplicateCount = 1;
            }

            if (duplicateCount >= consecutive) {
                temp[i + 1] = '0';
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : temp) {
            if (c != '0') {
                result.append(c);
            }
        }

        return result.toString();
    }
}