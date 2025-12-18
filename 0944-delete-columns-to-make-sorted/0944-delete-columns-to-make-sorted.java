class Solution {
    public int minDeletionSize(String[] strs) {
        int wordLength = strs[0].length();

        int willDelete = 0;
        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                int current = strs[j].charAt(i) - 'a';
                int next = strs[j + 1].charAt(i) - 'a';
                if (current > next) {
                    willDelete++;
                    break;
                }
            }
        }

        return willDelete;
    }
}