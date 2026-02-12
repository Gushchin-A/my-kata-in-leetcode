class Solution {
    private static Set<Character> vowels = Set.of('a','e','i','o', 'u');

    public int maxFreqSum(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        int maxVowel = freq.entrySet().stream()
                .filter(e -> vowels.contains(e.getKey()))
                .map(Map.Entry::getValue)
                .max(Integer::compareTo)
                .orElse(0);

        int maxConsonant = freq.entrySet().stream()
                .filter(e -> !vowels.contains(e.getKey()))
                .map(Map.Entry::getValue)
                .max(Integer::compareTo)
                .orElse(0);

        return maxVowel + maxConsonant;
    }
}