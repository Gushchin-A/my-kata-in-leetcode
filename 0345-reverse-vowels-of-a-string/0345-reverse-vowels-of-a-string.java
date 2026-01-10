class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        while (left < right) {

            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (right > left && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return switch (c) {
            case 'A', 'E', 'I', 'O', 'U', 
                 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}