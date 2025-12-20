class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String w : words) {
                int left = 0;
                int right = 0;
                while (right <= w.length()) {
                    if (right == w.length() || w.charAt(right) == separator) {
                        if (left < right) {
                            result.add(w.substring(left, right));
                        }
                        left = right + 1;
                    }
                    right++;
                }
        }

        return result;
    }
}