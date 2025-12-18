class Solution {
    public int minDeletionSize(String[] strs) {
        String result = String.join("", strs);
        int wordLength = strs[0].length();
        
        int willDelete = 0;
        for (int i = 0; i < wordLength; i++) {
            for (int j = i; j < result.length() - wordLength; j++) {
                int current = result.charAt(j) - 'a';
                int next = result.charAt(j + wordLength) - 'a';
                if (current <= next) {
                    j += wordLength - 1;
                } else {
                    willDelete++;
                    break;
                }
            }
        }

        return willDelete;
    }
}