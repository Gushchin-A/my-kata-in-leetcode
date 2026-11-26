class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        boolean seenOne = false;

        int distance = 0;
        int countZero = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && seenOne) {
                distance = Math.max(distance, countZero + 1);
                countZero = 0;
            } else if (binary.charAt(i) == '0') {
                countZero++;
            }

            if (binary.charAt(i) == '1') {
                seenOne = true;
            }
        }

        return distance;
    }
}
