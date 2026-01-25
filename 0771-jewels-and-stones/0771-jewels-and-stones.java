class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsStorage = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            jewelsStorage.add(c);
        }

        int result = 0;
        for (char c : stones.toCharArray()) {
            if (jewelsStorage.contains(c)) {
                result++;
            }
        }

        return result;
    }
}