class Solution {
    public int reverseBits(int n) {
        String binaryStr = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binaryStr);

        while (sb.length() < 32) {
            sb.insert(0, '0');
        }

        return (int) Long.parseLong(sb.reverse().toString(), 2);
    }
}
