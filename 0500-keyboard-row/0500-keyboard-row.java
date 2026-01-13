class Solution {
    private static final Set<Character> FIRST_ROW = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    private static final Set<Character> SECOND_ROW = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    private static final Set<Character> THIRD_ROW = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

    public String[] findWords(String[] words) {
        String[] result = new String[words.length];

        int newSize = 0;
        for (String s : words) {
            if (isWordRow(s)) {
                result[newSize++] = s;
            }
        }

        return Arrays.copyOf(result, newSize);
    }

    private boolean isWordRow(String s) {
        String sLower = s.toLowerCase();
        char firstLetter = sLower.charAt(0);

        Set<Character> row;

        if (FIRST_ROW.contains(firstLetter)) {
            row = FIRST_ROW;
        } else if (SECOND_ROW.contains(firstLetter)) {
            row = SECOND_ROW;
        } else if (THIRD_ROW.contains(firstLetter)) {
            row = THIRD_ROW;
        } else {
            return false;
        }

        for (char c : sLower.toCharArray()) {
            if (!row.contains(c)) {
                return false;
            }
        }

        return true;
    }
}
