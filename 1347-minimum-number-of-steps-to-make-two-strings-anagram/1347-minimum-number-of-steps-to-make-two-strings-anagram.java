class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countS.merge(s.charAt(i), 1, Integer::sum);
            countT.merge(t.charAt(i), 1, Integer::sum); 
        }

        int steps = 0;
        for (Map.Entry<Character, Integer> entry : countS.entrySet()) {
            int valueS = entry.getValue();
            int valueT = countT.get(entry.getKey()) == null ? 0 : countT.get(entry.getKey());

            int difference = valueS - valueT;
            if (difference > 0) {
                steps += difference;
            }
        }

        return steps;
    }
}