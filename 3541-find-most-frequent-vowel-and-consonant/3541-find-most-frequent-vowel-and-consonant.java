class Solution {
    private static Set<Character> vowels = Set.of('a','e','i','o', 'u');

    public int maxFreqSum(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        int maxVowel = 0;
        int maxConsonant = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();
            
            if (vowels.contains(currentChar)) {
                maxVowel = Math.max(currentCount, maxVowel);
            } else {
                maxConsonant = Math.max(currentCount, maxConsonant);
            }
        }

        return maxVowel + maxConsonant;
    }
}