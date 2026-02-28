class Solution {
    public int minimumFlips(int n) {
        String binaryStr = Integer.toBinaryString(n);

        int needFlip = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            char originStr = binaryStr.charAt(i);
            char reverseStr = binaryStr.charAt(binaryStr.length() - i - 1);
            if (originStr != reverseStr) {
                needFlip++;
            }
        }

        return needFlip;
    }
}