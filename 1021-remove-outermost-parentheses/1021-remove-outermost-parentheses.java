class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder temp = new StringBuilder();

        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    temp.append(c);
                }
                balance++;
            } else {
                if (balance > 1) {
                    temp.append(c);
                }
                balance--;
            }
        }
        return new String(temp);
    }
}