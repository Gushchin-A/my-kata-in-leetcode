class Solution {
    public int maxDistinct(String s) {
        Set<Character> seen = new HashSet<>();

        int result = 0;
        for (char c : s.toCharArray()) {
            if (seen.add(c)) {
                result++;
            }
        }

        return result;
    }
}