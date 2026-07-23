class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] counts = new int[26];
        for (char c : sentence.toCharArray()) {
            counts[c - 'a']++; 
        }

        for (int value : counts) {
            if (value == 0) {
                return false;
            }
        }

        return true;
    }
}
