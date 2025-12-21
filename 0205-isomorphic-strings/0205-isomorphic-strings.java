class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);
            if (mapS.containsKey(currentS)) {
                if (mapS.get(currentS) != currentT) {
                    return false;
                }
            } else if (mapT.containsKey(currentT)) {
                if (mapT.get(currentT) != currentS) {
                    return false;
                }
            } else {
                mapS.put(currentS, currentT);
                mapT.put(currentT, currentS);
            }
        }
        
        return true;
    }
}