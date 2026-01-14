class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        StringBuilder temp = new StringBuilder(n + n);
        temp.append(s);
        temp.append(s);

        return temp.substring(1, temp.length() - 1).contains(s);
    }
}