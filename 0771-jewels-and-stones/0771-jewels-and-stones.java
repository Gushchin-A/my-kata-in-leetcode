class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewelsStorage = new boolean[128];

        for (char c : jewels.toCharArray()) {
            jewelsStorage[c] = true;
        }

        int result = 0;
        for (char c : stones.toCharArray()) {
            if (jewelsStorage[c]) {
                result++;
            }
        }

        return result;
    }
}