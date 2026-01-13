class Solution {
    public String[] findWords(String[] words) {
        String[] result = new String[words.length];

        int newSize = 0;
        for (String s : words) {
            if (isFirstRow(s)) {
                result[newSize] = s;
                newSize++;
            } else if (isSecondRow(s)) {
                result[newSize] = s;
                newSize++;
            } else if (isThirdRow(s)) {
                result[newSize] = s;
                newSize++;
            }
        }

        return Arrays.copyOf(result, newSize);
    }

    private boolean isFirstRow(String s) {
        Set<Character> firstRow = Set.of(
                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
                'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'
        );

        for (char c : s.toCharArray()) {
            if (!firstRow.contains(c)) {
                return false;
            }
        }

        return true;
    }

    private boolean isSecondRow(String s) {
        Set<Character> secondRow = Set.of(
                'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'
        );

        for (char c : s.toCharArray()) {
            if (!secondRow.contains(c)) {
                return false;
            }
        }

        return true;
    }

    private boolean isThirdRow(String s) {
        Set<Character> thirdRow = Set.of(
                'z', 'x', 'c', 'v', 'b', 'n', 'm',
                'Z', 'X', 'C', 'V', 'B', 'N', 'M'
        );


        for (char c : s.toCharArray()) {
            if (!thirdRow.contains(c)) {
                return false;
            }
        }

        return true;
    }
}