class Solution {
    public int calculateScore(int a, int b) {
        int s1 = getBitsFromBinaryString(Integer.toBinaryString(a));
        int s2 = getBitsFromBinaryString(Integer.toBinaryString(b));

        return s1 >= s2 ? s1 * s2 : s2 / s1;
    }

    private int getBitsFromBinaryString(String binary) {
        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result++;
            }
        }

        return result;
    }
}
