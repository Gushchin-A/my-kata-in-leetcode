class Solution {
    public List<String> commonChars(String[] words) {
        final int constraintsValue = 100;
        int[] freq = new int[26];
        Arrays.fill(freq, constraintsValue);

        for (String w : words) {
            int[] temp = new int[26];
            for (char c : w.toCharArray()) {
                temp[c - 'a'] += 1;
            }
            for (int i = 0; i < freq.length; i++) {
                freq[i] = Math.min(freq[i], temp[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                char current = (char) (i + 'a');
                result.add(String.valueOf(current));
            }
        }

        return result;
    }
}