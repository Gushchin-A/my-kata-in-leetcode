class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> characters = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> uniq = new HashMap<>(characters);
        for (Character key : characters.keySet()) {
            for (String w : words) {
                if (w.indexOf(key) == -1) {
                    uniq.remove(key);
                }
            }
        }

        for (Character key : uniq.keySet()) {
            int count = 0;
            for (int i = 1; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    char c = words[i].charAt(j);
                    if (key == c) {
                        count++;
                    }
                }
                int tempValue = uniq.get(key);
                uniq.put(key, Math.min(tempValue, count));
                count = 0;
            }
        }

        List<String> result = new ArrayList<>();
        for (Character key : uniq.keySet()) {
            int n = uniq.get(key);
            for (int i = 0; i < n; i++) {
                result.add(String.valueOf(key));
            }
        }

        return result;
    }
}