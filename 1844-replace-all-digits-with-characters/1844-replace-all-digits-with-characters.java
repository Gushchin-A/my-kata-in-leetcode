class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += 2) {
            str.append(s.charAt(i));
            if (i + 1 < s.length()) {
                int shift = (s.charAt(i) - '0') + (s.charAt(i + 1) - '0');
                char shiftChar = (char) (shift + '0');
                str.append(shiftChar);
            }
        }

        return str.toString();
    }
}