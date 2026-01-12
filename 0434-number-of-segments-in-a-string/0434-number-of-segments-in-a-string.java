class Solution {
    public int countSegments(String s) {
        String normalized = s.trim();
        if (normalized.isEmpty()) {
            return 0;
        }

        String[] words = normalized.split("\\s+");

        return words.length;
    }
}