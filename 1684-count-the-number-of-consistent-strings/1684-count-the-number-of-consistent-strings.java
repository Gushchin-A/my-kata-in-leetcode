class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for (String w : words) {
            boolean isConsistent = true;
            Set<Character> uniq = new HashSet<>();
            for (char c : w.toCharArray()) {
                if (uniq.add(c)) {
                    if (!allowed.contains(String.valueOf(c))) {
                        isConsistent = false;
                        break;
                    }
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}