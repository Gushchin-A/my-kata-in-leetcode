class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> sCounts = new HashMap<>();

        for (String word : s1.split("\\s+")) {
            sCounts.merge(word, 1, Integer::sum);
        }

        for (String word : s2.split("\\s+")) {
            sCounts.merge(word, 1, Integer::sum);
        }

        ArrayList<String> result = new ArrayList<>(sCounts.size());
        for (Map.Entry<String, Integer> word : sCounts.entrySet()) {
            if (word.getValue() == 1) {
                result.add(word.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}