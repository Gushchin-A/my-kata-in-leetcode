class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        LinkedList<Character> checkBrackets = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                checkBrackets.add(bracket);
            }

            if (bracket == ')') {
                Character lastBracket = checkBrackets.pollLast();

                if (lastBracket == null || lastBracket != '(') {
                    return false;
                }
            }

            if (bracket == ']') {
                Character lastBracket = checkBrackets.pollLast();
                if (lastBracket == null || lastBracket != '[') {
                    return false;
                }
            }

            if (bracket == '}') {
                Character lastBracket = checkBrackets.pollLast();
                if (lastBracket == null || lastBracket != '{') {
                    return false;
                }
            }
        }

        return checkBrackets.isEmpty();
    }
}
