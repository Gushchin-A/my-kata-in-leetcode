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
        String sLower = s.toLowerCase();
        for (char c : sLower.toCharArray()) {
            switch (c) {
                case 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' -> {
                }
                default -> {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSecondRow(String s) {
        String sLower = s.toLowerCase();
        for (char c : sLower.toCharArray()) {
            switch (c) {
                case 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' -> {
                }
                default -> {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isThirdRow(String s) {
        String sLower = s.toLowerCase();
        for (char c : sLower.toCharArray()) {
            switch (c) {
                case 'z', 'x', 'c', 'v', 'b', 'n', 'm' -> {
                }
                default -> {
                    return false;
                }
            }
        }
        return true;
    }
}