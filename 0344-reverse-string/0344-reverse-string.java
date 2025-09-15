class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        int halfLength = s.length / 2;

        int j = 0;
        for (int i = length - 1; i >= halfLength; i--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j++;
        }
    }
}
