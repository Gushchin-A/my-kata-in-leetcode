class Solution {
    public String removeTrailingZeros(String num) {
        int end = -1;

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                end = i + 1;
                break;
            }
        }

        return end != -1 ? num.substring(0, end) : "";
    }
}
