class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> uniq = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            uniq.put(c, uniq.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> freq = new HashMap<>();

            for (char c : words[i].toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            for (Character key : uniq.keySet()) {
                uniq.put(key, Math.min(uniq.get(key), freq.getOrDefault(key, 0)));
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