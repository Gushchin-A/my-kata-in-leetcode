class Solution {
    public int firstUniqChar(String s) {
        int[] storage = new int[26];

        for (char c : s.toCharArray()) {
            storage[c - 'a']++;  
        }

        int index = 0;
        for (char c : s.toCharArray()) {
            if (storage[c - 'a'] == 1) {
                return index;
            }
            index ++;
        }

        return -1;
    }
}