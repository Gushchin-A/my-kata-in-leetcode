class Solution {
    public int similarPairs(String[] words) {
        int pairs = 0;

        for (int i = 0; i < words.length - 1; i++) {
            Set<Character> uniqA = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                uniqA.add(c);
            }

            for (int j = i + 1; j < words.length; j++) {
                Set<Character> uniqB = new HashSet<>();
                for (char c : words[j].toCharArray()) {
                    uniqB.add(c);
                }
                if (uniqA.equals(uniqB)) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}