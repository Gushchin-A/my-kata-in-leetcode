class Solution {
    public String interpret(String command) {
        int n = command.length();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) != ')') {
                    result.append("al");
                    i += 3;
                } else {
                    result.append("o");
                    i += 1;
                }
            } else {
                result.append("G");
            }
        }

        return result.toString();
    }
}