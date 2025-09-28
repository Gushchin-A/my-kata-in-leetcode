class Solution {
    public boolean backspaceCompare(String s, String t) {
        String copyS = stringWithoutBackspace(s);
        String copyT = stringWithoutBackspace(t);

        return copyS.equals(copyT);
    }
    
    private String stringWithoutBackspace(String str) {
        StringBuilder result = new StringBuilder();

        int i = str.length() - 1;
        int canDelete = 0;
        while (i >= 0) {
            if (str.charAt(i) == '#') {
                canDelete++;
                i--;
            } else {
                if (canDelete > 0) {
                    canDelete--;
                    i--;
                } else {
                    result.append(str.charAt(i));
                    i--;
                }
            }
        }

        return result.toString();
    }
}
