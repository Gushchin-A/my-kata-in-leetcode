class Solution {
    public boolean isSubsequence(String s, String t) {        
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        
        return i < s.length() ? false : true;
    }
}
