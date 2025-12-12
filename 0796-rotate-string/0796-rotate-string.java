class Solution {
    public boolean rotateString(String s, String goal) {
        int n = goal.length();

        int i = 0;
        while (i < n) {
            s = pleaseHelpMeShiftString(s);
            if (s.equals(goal)) {
                return true;
            }
            i++;
        }

        return false;
    }

    public String pleaseHelpMeShiftString(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int newIndex = (i + 1) % s.length();
            result.append(s.charAt(newIndex));
        }

        return result.toString();
    }
}