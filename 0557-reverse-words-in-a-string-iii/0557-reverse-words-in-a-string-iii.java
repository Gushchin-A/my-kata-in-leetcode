class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                int end = i - 1;
                while (end >= start) {
                    result.append(s.charAt(end));
                    end--;
                }
                result.append(" ");
                start = i + 1;
            }
        }

        int end = s.length() - 1;
        while (end >= start) {
            result.append(s.charAt(end));
            end--;
        }

        return result.toString();
    }
}