class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();
        char[] arrayS = s.toCharArray(); 
        
        for (char c : arrayS) {
            storage.put(c, storage.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < arrayS.length; i++) {
            if (storage.get(arrayS[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}