class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> uniq = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            uniq.add(s.charAt(i));
        }

        return uniq.size();
    }
}
