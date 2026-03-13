class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();

        int canDelete = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                canDelete++;
            } else {
                if (canDelete > 0) {
                    canDelete--;
                } else {
                    result.append(temp);
                }
            }
        }

        return result.reverse().toString();
    }
}