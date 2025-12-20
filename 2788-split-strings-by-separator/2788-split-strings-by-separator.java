class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String w : words) {
            if (w.indexOf(separator) != -1) {
                int left = 0;
                int right = 0;

                while (right < w.length()) {
                    if (w.charAt(right) == separator) {
                        if (right == 0) {
                            left++;
                            right++;
                            continue;
                        }
                        if (w.charAt(right - 1) == separator) {
                            right++;
                            left++;
                            continue;
                        }
                        result.add(w.substring(left, right));
                        left = right + 1;
                    } else if (right == w.length() - 1) {
                        result.add(w.substring(left, right + 1));
                    }
                    right++;
                }
            } else {
                result.add(w);
            }
        }

        return result;
    }
}