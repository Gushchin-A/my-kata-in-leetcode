class Solution {
    public String reverseVowels(String s) {
        Set<Character> letters = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (letters.contains(chars[left])) {
                while (right > left) {
                    if (letters.contains(chars[right])) {
                        char temp = chars[left];
                        chars[left] = chars[right];
                        chars[right] = temp;
                        left++;
                        right--;
                        break;
                    } else {
                        right--;
                    }
                }
            } else {
                left++;
            }
        }

        return new String(chars);
    }
}