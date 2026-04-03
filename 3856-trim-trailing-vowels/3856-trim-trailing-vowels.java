class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!isVowels(s.charAt(i))) {
                for (int j = 0; j <= i; j++) {
                    result.append(s.charAt(j));
                }
                break;
            }
        }

        return result.toString();
    }

    private boolean isVowels(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}