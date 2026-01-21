class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> sCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            sCounts.merge(c, 1, Integer::sum);
        }

        int result = 0;

        boolean isGood = true;
        while (isGood) {
            for (char c : target.toCharArray()) {
                if (!sCounts.containsKey(c)) {
                    isGood = false;
                    break;
                } else {
                    if (sCounts.get(c) <= 0) {
                        isGood = false;
                        break;
                    } else {
                        sCounts.merge(c, -1, Integer::sum);
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