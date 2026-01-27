class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String sAll = String.join(" ", s1, s2);
        HashMap<String, Integer> sCounts = new HashMap<>();

        for (String word : sAll.split(" ")) {
            sCounts.merge(word, 1, Integer::sum);
        }

        String[] result = new String[s1.length() + s2.length()];
        int indexRes = 0;
        for (Map.Entry<String, Integer> word : sCounts.entrySet()) {
            if (word.getValue() == 1) {
                result[indexRes++] = word.getKey();
            }
        }
        
        return Arrays.copyOfRange(result, 0, indexRes);
    }
}