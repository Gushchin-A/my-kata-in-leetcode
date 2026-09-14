class Solution {
    public String reverseOnlyLetters(String s) {
        char[] result = new char[s.length()];
        
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (!Character.isLetter(s.charAt(left))) {
                result[left] = s.charAt(left);
                left++;
                continue;
            }
            
            if (!Character.isLetter(s.charAt(right))) {
                result[right] = s.charAt(right);
                right--;
                 continue;
            }
            
            result[left] = s.charAt(right);
            result[right] = s.charAt(left);
            
            left++;
            right--;
        }
        
        return new String(result);
    }
}