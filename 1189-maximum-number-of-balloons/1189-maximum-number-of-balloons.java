class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] balloon = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        Map<Character, Integer> charsCounts = new HashMap<>();

        for (char c : text.toCharArray()) {
            charsCounts.put(c, charsCounts.getOrDefault(c, 0) +1);
        }

        int result = 0;

        boolean isGood = true;
        while (isGood) {
            for (char c : balloon) {
                if (!charsCounts.containsKey(c)) {
                    isGood = false;
                    break;
                } else {
                    if (charsCounts.get(c) <= 0) {
                        isGood = false;
                        break;
                    } else {
                        charsCounts.put(c, charsCounts.get(c) - 1);
                    }
                }
            }
            if (isGood) {
                result += 1;
            }
        }

        return result;
    }
}