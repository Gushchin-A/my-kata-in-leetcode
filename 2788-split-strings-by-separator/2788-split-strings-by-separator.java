class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String w : words) {
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) != separator) {
                    word.append(w.charAt(i));
                } else {
                    if (!word.isEmpty()) {
                        result.add(word.toString());
                        word.setLength(0);
                    }
                }
            }
            if (!word.isEmpty()) {
                result.add(word.toString());
            }
        }

        return result;
    }
}