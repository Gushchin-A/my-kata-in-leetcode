class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();

        for (char c : brokenLetters.toCharArray()) {
            broken.add(c);
        }

        int canType = 0;
        for (String word : text.split("\\s+")) {
            boolean fullyWord = true;
            for (char c : word.toCharArray()) {
                if (!broken.add(c)) {
                    fullyWord = false;
                    break;
                }
                broken.remove(c);
            }
            if (fullyWord) {
                canType++;
            }
        }

        return canType;
    }
}