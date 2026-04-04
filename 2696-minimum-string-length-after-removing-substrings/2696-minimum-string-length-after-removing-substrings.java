class Solution {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char lastStr;

            if (str.length() > 0) {
                lastStr = str.charAt(str.length() - 1);
            } else {
                str.append(currentS);
                continue;
            }

            if (lastStr == 'A' && currentS == 'B') {
                str.deleteCharAt(str.length() - 1);
            } else if (lastStr == 'C' && currentS == 'D') {
                str.deleteCharAt(str.length() - 1);
            } else {
                str.append(currentS);
            }
        }

        return str.length();
    }
}