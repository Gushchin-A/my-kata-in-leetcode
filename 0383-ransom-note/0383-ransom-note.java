class Solution { 
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] storage = new int[26];

        for (char c : magazine.toCharArray()) {
            storage[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            storage[c - 'a']--;
            if (storage[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
