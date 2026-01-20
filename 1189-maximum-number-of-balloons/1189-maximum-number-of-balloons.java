class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> charsCounts = new HashMap<>();

        for (char c : text.toCharArray()) {
            charsCounts.merge(c, 1, Integer::sum);
        }

        int b = charsCounts.get('b') == null ? 0 : charsCounts.get('b');
        int a = charsCounts.get('a') == null ? 0 : charsCounts.get('a');
        int l = charsCounts.get('l') == null ? 0 : charsCounts.get('l') / 2;
        int o = charsCounts.get('o') == null ? 0 : charsCounts.get('o') / 2;
        int n = charsCounts.get('n') == null ? 0 : charsCounts.get('n');

        return Math.min(Math.min(a, b),
                Math.min(Math.min(l, o), n));
    }
}