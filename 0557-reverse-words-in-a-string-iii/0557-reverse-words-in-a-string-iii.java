class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        
        int start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                int end = i - 1;
                while (end >= start) {
                    result.append(s.charAt(end));
                    end--;
                }
                if (i < s.length()) {
                    result.append(" ");
                }
                start = i + 1;
            }
        }

        return result.toString();
    }
}