class Solution {
    public int hammingDistance(int x, int y) {
        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);

        int diff = Math.abs(strX.length() - strY.length());

        StringBuilder temp = new StringBuilder();
        if (strX.length() < strY.length()) {
            for (int i = 0; i < diff; i++) {
                temp.append('0');
            }
            temp.append(strX);
            strX = temp.toString();
        } else {
            for (int i = 0; i < diff; i++) {
                temp.append('0');
            }
            temp.append(strY);
            strY = temp.toString();
        }

        int result = 0;
        for (int i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) != strY.charAt(i)) {
                result++;
            }
        }

        return result;
    }
}
