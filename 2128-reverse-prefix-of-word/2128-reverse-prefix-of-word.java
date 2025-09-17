class Solution {
    public String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        
        char target = ch;
        int targetIndex = 0;
        for (char c : charArray) {
            if (c == target) {
                int rigth = targetIndex;
                int left = 0;
                while (left < rigth) {
                    char temp = charArray[left];
                    charArray[left] = charArray[rigth];
                    charArray[rigth] = temp;
                    left++;
                    rigth--;
                }
                break;
            } else {
                targetIndex++;
            }
        }
        
        return String.valueOf(charArray);
    }
}
