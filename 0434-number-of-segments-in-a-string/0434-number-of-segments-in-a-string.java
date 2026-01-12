class Solution {
    public int countSegments(String s) {
        String[] words = s.trim().split("\\s+");
        
        return words[0].isEmpty() ? 0 : words.length;
    }
}