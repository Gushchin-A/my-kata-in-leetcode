class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = stack.length();
            if (n > 0) {
                char top = stack.charAt(n - 1);
                if (top != c && Character.toLowerCase(top) == Character.toLowerCase(c)) {
                    stack.deleteCharAt(n - 1);         
                } else {
                    stack.append(c);
                }
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}
