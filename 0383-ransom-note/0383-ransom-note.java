class Solution { 
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] storage = magazine.toCharArray();

        boolean notCoincidence = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0 ; j < storage.length; j++) {
                if (ransomNote.charAt(i) == storage[j]) {
                    storage[j] = '\0';
                    notCoincidence = false;
                    break;
                } else {
                    notCoincidence = true;
                }
            }
            if (notCoincidence) {
                return false;
            }
        }

        return true;
    }
}