class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder temp = new StringBuilder();
        
        int balance = 0;
        int start = 0;
        int end = 0;
        boolean isPrimitive = false;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(') {
                balance++;
                if (balance == 1 && !isPrimitive) {
                    isPrimitive = true;
                    start = i + 1;
                }
            } else {
                balance--;
                if (balance == 0) {
                    isPrimitive = false;
                }
            }

            if (!isPrimitive) {
                end = i;
                temp.append(s.substring(start, end));
            }
        }

        return new String(temp);
    }
}