class Solution { 
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> storage = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            storage.put(c, storage.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (storage.get(c) == null || storage.get(c) == 0) {
                return false;
            }
            
            storage.put(c, storage.getOrDefault(c, 0) - 1);
            if (storage.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}
