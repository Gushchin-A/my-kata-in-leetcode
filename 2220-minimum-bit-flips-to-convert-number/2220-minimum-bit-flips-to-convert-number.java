class Solution {
    public int minBitFlips(int start, int goal) {
        String startStr = Integer.toBinaryString(start);
        String goalStr = Integer.toBinaryString(goal);

        int diff = Math.abs(startStr.length() - goalStr.length());

        StringBuilder temp = new StringBuilder();
        if (startStr.length() < goalStr.length()) {
            for (int i = 0; i < diff; i++) {
                temp.append('0');
            }
            temp.append(startStr);
            startStr = temp.toString();
        } else {
            for (int i = 0; i < diff; i++) {
                temp.append('0');
            }
            temp.append(goalStr);
            goalStr = temp.toString();
        }

        int result = 0;
        for (int i = 0; i < startStr.length(); i++) {
            if (startStr.charAt(i) != goalStr.charAt(i)) {
                result++;
            }
        }

        return result;
    }
}