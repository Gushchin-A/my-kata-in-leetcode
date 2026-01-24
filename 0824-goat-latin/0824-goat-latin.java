class Solution {
    private static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (vowels.contains(Character.toLowerCase(words[i].charAt(0)))) {
                words[i] = words[i] + "ma" + "a".repeat(i + 1);
            } else {
                words[i] = words[i].substring(1) + words[i].charAt(0)
                        + "ma" + "a".repeat(i + 1);
            }
        }

        return String.join(" ", words);
    }
}