class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result.append('0');
            } else {
                result.append('1');
            }
        }

        return Integer.parseInt(result.toString(), 2);
    }
}