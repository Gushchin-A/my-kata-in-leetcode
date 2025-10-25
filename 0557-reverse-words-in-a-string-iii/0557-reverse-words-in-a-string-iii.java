class Solution {
    public String reverseWords(String s) {
        char[] array = s.toCharArray(); 
        
        int left = 0;
        int right = 0;
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length || array[i] == ' ') {
                right = i - 1;
                while (left < right) {
                    char temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }

        return new String(array);
    }
}