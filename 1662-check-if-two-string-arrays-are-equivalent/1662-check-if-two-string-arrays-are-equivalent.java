class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> uniq = arrayStringsToList(word1);

        int indexUniq = 0;
        for (String w : word2) {
            if (w.length() > uniq.size() - indexUniq) {
                return false;
            }
            for (int i = 0; i < w.length(); i++) {
                if (uniq.get(indexUniq) != w.charAt(i)) {
                    return false;
                }
                indexUniq++;
            }
        }

        return indexUniq == uniq.size();
    }

    public static List<Character> arrayStringsToList(String[] word) {
        List<Character> uniq = new ArrayList<>();

        for (String w : word) {
            for (int i = 0; i < w.length(); i++) {
                uniq.add(w.charAt(i));
            }
        }

        return uniq;
    }
}