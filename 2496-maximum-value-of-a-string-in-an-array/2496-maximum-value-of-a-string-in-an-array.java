class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String str : strs) {
            int candidate = getValueFromStr(str);
            max = Math.max(max, candidate);
        }

        return max;
    }

    private int getValueFromStr(String str) {
        int result = 0;

        for (char c : str.toCharArray()) {
            if (c > '9') {
                return str.length();
            } else {
                int digit = c - '0';
                result = result * 10 + digit;
            }
        }

        return result;
    }
}
