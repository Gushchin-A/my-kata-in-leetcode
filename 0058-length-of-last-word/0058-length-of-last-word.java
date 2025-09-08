class Solution {
    public int lengthOfLastWord(String s) {

        // cut off spaces at the beginning and at the end
        // find the index where the space occurs last
        // cut off after this space and to the end
        // calculate the length of the word
        
        var trimmedS = s.trim();
        var lastIndexSpace = trimmedS.lastIndexOf(' ');
        var lastWord = trimmedS.substring(lastIndexSpace + 1);
        return lastWord.length();
    }
}