class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> words = stringToListOnlyWords(paragraph);

        Set<String> bannedSet = Set.of(banned);
        Map<String, Integer> countWord = new HashMap<>();
        int max = 0;
        String commonWord = words.getFirst();
        for (String w : words) {
            if (bannedSet.contains(w)) {
                continue;
            }
            countWord.put(w, countWord.getOrDefault(w, 0) + 1);
            if (countWord.get(w) > max) {
                max = countWord.get(w);
                commonWord = w;
            } else if (countWord.get(w) == max) {
                commonWord = w.compareTo(commonWord) < 0 ? w : commonWord;
            }
        }

        return commonWord;
    }

    public List<String> stringToListOnlyWords(String paragraph) {
        List<String> words = new ArrayList<>();

        String s = paragraph.toLowerCase();
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    words.add(s.substring(start, i));
                    start = -1;
                }
            }
        }

        if (start != -1) {
            words.add(s.substring(start));
        }

        return words;
    }
}