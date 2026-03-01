class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            int temp = Math.abs(s.charAt(i) - s.charAt(i + 1));
            result += temp;
        }

        return result;
    }
}