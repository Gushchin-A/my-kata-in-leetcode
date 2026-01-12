class Solution {
    public int countSegments(String s) {
        String normalized = s.trim();
        
        if (normalized.isEmpty()) {
            return 0;
        }

        return normalized.split("\\s+").length;
    }
}