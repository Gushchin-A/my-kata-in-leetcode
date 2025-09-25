class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        int coincidence = 0;
        int j = 0;
        int i = 0;
        while (i < sLength) {
            while (j < tLength) {
                if (s.charAt(i) == t.charAt(j)) {
                    coincidence++;
                    j++;
                    break;
                } else {
                    j++;
                }
            }
            if (coincidence == i) {
            return false;
            }
            i++;
        }
        
        return true;
    }
}
