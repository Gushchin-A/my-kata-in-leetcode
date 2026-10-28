class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            for (int j = 0; j < count.length; j++) {
                if (count[j] != 0) {
                    result.append((char) ('a' + j));
                    count[j]--;
                }
            }

            for (int x = count.length - 1; x >= 0; x--) {
                if (count[x] != 0) {
                    result.append((char) ('a' + x));
                    count[x]--;
                }
            }
        }

        return result.toString();
    }
}