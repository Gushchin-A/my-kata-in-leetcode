class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() > goal.length() || s.length() < goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }

        int i = 0;
        while (i < goal.length()) {
            s = rotateLeftByOne(s);
            if (s.equals(goal)) {
                return true;
            }
            i++;
        }

        return false;
    }

    public static String rotateLeftByOne(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int newIndex = (i + 1) % s.length();
            result.append(s.charAt(newIndex));
        }

        return result.toString();
    }
}