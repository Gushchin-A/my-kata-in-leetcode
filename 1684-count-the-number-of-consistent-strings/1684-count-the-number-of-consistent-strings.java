class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String w : words) {
            boolean isExtraSymbol = false;
            for (char c : w.toCharArray()) {
                boolean foundInAllowed = false;
                for (char a : allowed.toCharArray()) {
                    if (c == a) {
                        foundInAllowed = true;
                        break;
                    }
                }
                if (!foundInAllowed) {
                    isExtraSymbol = true;
                    break;
                }
            }
            if (!isExtraSymbol) {
                count++;
            }
        }

        return count;
    }
}