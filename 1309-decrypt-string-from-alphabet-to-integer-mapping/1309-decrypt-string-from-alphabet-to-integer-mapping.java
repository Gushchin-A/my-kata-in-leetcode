class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();

        StringBuilder temp = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (current == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                temp.append((char) ('a' + num - 1));
                i -= 2;
            } else {
                int num = current - '0';
                temp.append((char) ('a' + num - 1));
            }
        }

        return temp.reverse().toString();
    }
}